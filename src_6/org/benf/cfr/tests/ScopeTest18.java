package org.benf.cfr.tests;

import org.benf.cfr.tests.support.ListFactory;

import java.util.List;

public class ScopeTest18 {

    public static void main(String... args) {
        String fred;
        for (String arg : args) {
            switch (args.length) {
                case 0:
                    fred = "";
                    break;
                case 1:
                    fred = "ONE";
                    break;
                case 2:
                    fred = "AD";
                default:
                    fred = "S";
            }
            System.out.println("FFOO" + fred);

        }
    }

}
