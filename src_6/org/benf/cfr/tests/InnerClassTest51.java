package org.benf.cfr.tests;


/**
* Another AbeC!
 */
public class InnerClassTest51 {

    public void foo() {
        class Bug {
            Object o = new Object(){};

            Bug() {
            }

            Bug(int x) {
            }
        }
    }
}