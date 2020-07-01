package org.benf.cfr.tests;

public class LoopTestGrax {
    public static void main(String[] args) {
        int n = 15;
        for (float i = 0; i < n; i++, i*= 2, System.out.println(i), i -= 2, i *= 1.2, i += 0.5) {
        }
    }
}
