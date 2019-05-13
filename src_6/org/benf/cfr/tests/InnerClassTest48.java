package org.benf.cfr.tests;


/**
* Another AbeC!
 */
public class InnerClassTest48 {
    public static void main(String[] args) {
        // CFR drops inner class
        class HelloWorld {
        }
        System.out.println(HelloWorld.class);
    }
}