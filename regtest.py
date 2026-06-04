#!/usr/bin/python

#
# A fairly quick and dirty test runner.  It would be nice to integrate this into the pom,
# however, the feedback aspect of this is helpful, as is the ability to run a given jvm easily
# against a given target.
#

import os
import sys
import shutil
import subprocess
import itertools
import argparse
import glob
import re

if (sys.version_info < (3, 0)):
  raise Exception("Python 3 please!")

cfr_target = os.environ.get('CFR_TARGET')

if not cfr_target:
  raise Exception("Please set CFR_TARGET environment variable to location of CFR class files")

print ("Using CFR from " + cfr_target)

parser = argparse.ArgumentParser()
parser.add_argument('--target', default="java_13", help='Version of java target - java_6, java_8, java_13, hardcoded')
parser.add_argument('--jvm', default="java", help='Path of java binary')
parser.add_argument('--filter', default="*", help='Substring of test names to run. ')
parser.add_argument('--force', default="*", help='"y" to force acceptance of test results.')
parser.add_argument('--rename', default="true", help='"false" to stop renaming illegal idents.')
args = parser.parse_args()

shutil.rmtree("temptestfiles", ignore_errors=True)
os.mkdir("temptestfiles")


target = args.target
filter_re = ".*" if args.filter == "*" else ".*(" + args.filter + ").*"

if target == "hardcoded":
    root = "hardcoded"
else:
    root = os.path.join(
        "output",
        target,
        "org",
        "benf",
        "cfr",
        "tests"
    )

if args.filter == "*":
    # No filter: hand CFR a single wildcard path, as the original runner did.
    # Expanding the glob ourselves would put thousands of class files on one
    # command line, overflowing the OS limit (Windows: WinError 206).
    classfiles = [os.path.join(root, "*.class")]
else:
    # Find all class files recursively, then unanchored regex match basename.
    all_classfiles = glob.glob(
        os.path.join(root, "**", "*.class"),
        recursive=True
    )
    pattern = re.compile(filter_re)
    classfiles = [
        path for path in all_classfiles
        if pattern.search(os.path.basename(path))
    ]


print ("Target : " + target)
print ("Filter : " + filter_re)

#
# we'll use the version of java that the user has as default.
# ideally, we'd have a full cross product of java version * compiler version, 
# but that's a lot to run...... 
#
cmd = [
    args.jvm,
    "-classpath", cfr_target,
    "org.benf.cfr.reader.Main",
    *classfiles,
    "--showversion", "false",
    "--dumpexceptionstacktrace", "false",
    "--renameillegalidents", args.rename,
    "--outputdir", "temptestfiles"
]

subprocess.call(cmd)
expected_dir = os.path.join("expected", target)
if not os.path.exists(expected_dir):
  os.makedirs(expected_dir)

def update_if_accepted(message, patha, pathb):
  print (message)
  response = args.force
  print ("Was : " + pathb + "\nNow : " + patha + "\n")
  print ("Accept new? (y/n/b[ad])\n")
  while response != "y" and response != "n" and response != "b":
    response = sys.stdin.read(1).lower()
  if response == "y":
    shutil.copy(patha, pathb)
  elif response == "b":
    with open(pathb, "w") as text_file:
      text_file.write("Bad decompilation - fix!")


for path in itertools.chain(*[[a+"/"+x for x in c] for (a,b,c) in list(os.walk('temptestfiles'))]):
  if not(path.endswith(".java")):
    continue
  (_, file) = os.path.split(path)
  file = file[:-5]
  expected_path = os.path.join(expected_dir, file)
  print ("Checking " + file)

  if not(os.path.isfile(expected_path)):
    with open(path, 'r') as newfile:
      data = newfile.read()
    update_if_accepted(data + "\n--------New result for " + file, path, expected_path)
  else:    
    (res, diff) = subprocess.getstatusoutput("diff " + expected_path + " " + path)
    if res != 0:
      update_if_accepted(diff + "\n---------Difference in " + file, path, expected_path)
