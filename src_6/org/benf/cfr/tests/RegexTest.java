package org.benf.cfr.tests;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
    public static Pattern bar = Pattern.compile("(ab|a)([\\w]+)");

    static void test(String a) {
        Matcher matcher = bar.matcher(a);
        System.out.println("Match? " + matcher.matches());
        MatchResult mr = matcher.toMatchResult();
        System.out.println(a + " -> " + mr.group(1));
    }

    public static void main(String ... args) {
        test("abbbb");
        test("acccc");
        test("aaaaa");
    }
}
