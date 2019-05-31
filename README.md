# CFR_TESTS

This repository contains tests for the CFR java decompiler (and any other decompiler, but you know you want CFR), hosted at <a href="https://www.benf.org/other/cfr">benf.org/other/cfr</a>, and in github at <a href="https://github.com/leibnitz27/cfr">cfr</a>.

# First things first - why a separate test repo?

CFR is proudly, unabashedly, unashamedly, written in Java 6.  For <a href="https://github.com/leibnitz27/cfr/blob/master/README.md">reasons</a>. It's the future, you know.

.... but it decompiles Java 13. (And Kotlin/Scala/etc etc, if you want java back).

as such, it's easier to keep all the multi-javac versioning carefully to one side.

# So how do I run these tests?

*Before we start, an apology.  This 'framework' is something I've knocked up to suit me.  It's not amazingly pretty.  End Apology.*

1. Clone this repo ;)
1. Clone <a href="https://github.com/leibnitz27/cfr">cfr</a>
1. Make sure you've got `diff` on your path. (Linux/OSX you're fine, windows you'll need (eg) <a href="http://gnuwin32.sourceforge.net/packages/diffutils.htm">this</a> and make sure diff.exe is on your path.
1. Build cfr. (*but don't change it yet, we're going to generate a baseline*)
    1. ... and set up an environment variable CFR_TARGET, which points to the root of the output in target/classes
1. Build cfr_tests
    1. Install all verions of the JDK.  Go on.  6 onwards.  
    2. Set up your maven settings.xml to contain ${JAVA_6_HOME} .... ${JAVA_12_HOME} etc.  A template settings.xml file which you can fill in and put in ~/.m2 (or c:\users\whoeveryouare\.m2) is <a href="docs/settings.xml">here</a>
    3. Run compile.bat / compile.sh.  This will compile the tests under lots of flavours of JDK, and create lots of directories under `output`
1. Generate a baseline.  
    1. `python regtest.py --target java_6 --force y` will generate the baseline for java 6.
1. Break CFR. 
    1. No, go on.  Perhaps swap the lhs and rhs in the TernaryExpression constructor.  That sounds like fun!
1. Run the tests again.
    1. `python regtest.py --target java_6` (without the force argument, of course!)
    2. Wonder at the damage that you hath wrought.
    3. You should get a bunch of complaints.  You really don't want to accept them.
1. Fix CFR
1. Generate baselines for all the other java versions you care about (please, at least 6,8 and 13), and 'hardcoded'.

**Job done!**
  
