package org.benf.cfr.tests;

import java.util.List;

public class AnnotationTestCode8 {
    public void foo() {
        try {
            System.out.println("STUFF");
        }catch (@MyParam3 Exception e) {
            System.out.println("STUFF");
        }

        try {
            System.out.println("STUFF");
        }catch (@MyParam2 Exception e) {
            System.out.println("STUFF");
        }
    }
}
