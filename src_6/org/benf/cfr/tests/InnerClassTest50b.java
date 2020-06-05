package org.benf.cfr.tests;


/**
* Another AbeC!
 */
public class InnerClassTest50b {

    public void foo() {
        class Bug {
            void foo() {
                System.out.println("Bob");
            }
        }
        Bug b = new Bug();

        Bug c = new Bug() {
            @Override
            void foo() {
                System.out.println("Bar");
            }
        };

    }
}