# Contributing to CFR

*Thanks for visiting!*

# The badly phrased legal bit

You *absolutely* must not contribute, or attempt to contribute, code to which you do not hold the right to submit.   Don't cut and paste from work, m'kay?

*DON'T COMMIT BINARIES YOU DIDN'T CREATE*

Ok, that's out of the way.

# Great things to contribute

* Improvements to this test 'framework'.  Seriously, it's fairly cobbled together.  Maven doesn't naturally play well with multiple versions of javac simultaneously.
    * It would be amazing if the cross product of JRE/JDK could be tested, though it would probably take some time to run....
    * Currently the baseline doesn't differentiate between 'no regression', and 'could be better'.
* New tests! 
    * There are thousands of test cases, but there can always be more.   Find something CFR doesn't do right!

# Not great things to contribute

* Stuff you didn't author.  If you find something that makes CFR barf / produce bad output, GREAT.  But please generate a test case yourself before committing here.   Anyway, building a test case will help you understand the problem!
* Bad vibes.

# Before contributing

* Please start small, until I get to know you!  If you send me a 20kloc refactor out of the blue, I'm going to struggle.
* Please chat with me about what you're going to do.   You can get hold of me at lee@benf.org , or <a href="https://twitter.com/leeatbenf">@leeAtBenf</a> on Twitter.
* Please ensure that you have tested <a href="https://github.com/leibnitz27/cfr_tests">cfr_tests</a> against at least java 6, 8 and 13, and the hardcoded class files.
* Even if you pass all tests, I'll be verifying against a huge library of class files that I can't share, so passing all the tests is no guarantee you won't have broken things.  But we can work on that!
