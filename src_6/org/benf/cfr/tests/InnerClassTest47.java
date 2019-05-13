package org.benf.cfr.tests;


/**
* Another AbeC!
 */
public class InnerClassTest47 {
    public static void main(String[] args) {
        // CFR drops inner class
        class HelloWorld {
        }
        System.out.println((new HelloWorld()).getClass());
    }
}