package org.benf.cfr.tests;

public class LoadOrder2 {
    static {
        System.out.println("Other loaded");
    }

    static final LoadOrder1 CONSTANT = new LoadOrder1();
}
