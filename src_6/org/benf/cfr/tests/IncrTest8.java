package org.benf.cfr.tests;

import java.util.Arrays;

public abstract class IncrTest8 {

    public static void main(String ... args) {
        int v[] = new int[5];
        int i = 2;
        v[++i] = i;
        System.out.println(Arrays.toString(v));
    }
}
