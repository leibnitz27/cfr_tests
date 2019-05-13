package org.benf.cfr.tests;


/**
* Another AbeC!
 */
public class InnerClassTest50 {

    public void foo() {
        class Bug {
            Object o = new Object(){{System.out.println("Hello");}};

            Bug() {
            }

            Bug(int x) {
            }
        }
        Bug b = new Bug(1);
    }
}