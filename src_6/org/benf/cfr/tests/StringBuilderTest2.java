package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 03/04/2012
 */
public class StringBuilderTest2 {
    public String test1(int a, int b, int c) {
        return "this " + a + b + "is" + a + (b - c) + " c? " + ((a * b) - c)+ " c? " + ((a + b) - c);
    }

    public static void main(String [] args) {
        System.out.println(new StringBuilderTest2().test1(1,20,300));
    }
}
