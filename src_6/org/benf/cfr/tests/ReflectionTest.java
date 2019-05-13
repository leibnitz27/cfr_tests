package org.benf.cfr.tests;


/*
 * Test courtesy of Abe Crannaford
 */

import java.lang.reflect.Constructor;

class ReflectionTest {

    private final String secret;

    private ReflectionTest(String s) {
        secret = s;
    }

    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("ReflectionTest");
            Constructor<?> constructor = clazz.getDeclaredConstructor(String.class);
            constructor.setAccessible(true);
            Object o = constructor.newInstance("hi");
            System.out.println(((ReflectionTest)o).secret);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}