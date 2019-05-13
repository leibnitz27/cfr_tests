package org.benf.cfr.tests;


import org.benf.cfr.tests.support.Logger;
import org.benf.cfr.tests.support.LoggerFactory;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 03/04/2012
 */
public class CastTest1 {

    public static void test1(long l) {
        System.out.println(l);
        l = (short)(l);
        System.out.println(l);
    }

    public static void main(String[] args) {
        test1(1112121L);
    }
}
