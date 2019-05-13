package org.benf.cfr.tests;

public class AbeStrike {
    public static void main(String[] args) {
        // severely breaks sugaring
        Runnable r2 = new Object[0]::clone;
        Object[] foo = new Object[0];
        Runnable r3 = () -> (foo).clone();
    }
}
