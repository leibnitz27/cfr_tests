package org.benf.cfr.tests;


/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 03/04/2012
 */
public class CastTest2 {

    public static void test1(long l) {
        System.out.println(l);
        System.out.println((short)l);
    }

    public static void main(String[] args) {
        test1(1112121L);
    }
}
