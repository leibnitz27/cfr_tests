package org.benf.cfr.tests;

// Yet another from AbeC.
public class Weird3 {

        public static void test(boolean b) {
            Class<?> cls = b ? Weird2.class : Weird3.class;
            System.out.println(cls.getName());
        }
}
