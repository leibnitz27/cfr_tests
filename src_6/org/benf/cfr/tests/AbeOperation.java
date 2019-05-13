package org.benf.cfr.tests;

public class AbeOperation {
    public static void main(String[] args) {
        // CFR decompiles as boolean, attempts to negate
        int n;
        for(;;n = -(n = 0)) {
        }
    }
}
