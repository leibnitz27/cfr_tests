package org.benf.cfr.tests;

import java.io.Console;

public class NameTest28 {
    public static void main(String ... args) {
        for (int x=0;x<10;++x) {
            System.out.write(x);
        }
        {
            String s = "";
            System.out.print(s);
        }
        for (int x=0;x<10;++x) {
            System.out.write(x);
        }
    }
}
