package org.benf.cfr.tests;

import java.util.regex.Pattern;

public class LambdaImportTest {
    public void test() {
        /*
         * Unnecessarily imports:
         * - java.util.regex.Matcher
         * - java.util.function.Function;
         * - java.util.regex.MatchResult
         */
        Pattern.compile("test").matcher("test").replaceFirst(result -> "");
    }
}