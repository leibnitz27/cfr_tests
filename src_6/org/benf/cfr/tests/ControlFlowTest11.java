package org.benf.cfr.tests;

import java.util.List;

public class ControlFlowTest11 {
    private static boolean print(String s) {
        System.out.println(s);
        return true;
    }

    public static boolean test(String ... list) {
        boolean effect = false;
        for (String s : list) {
            effect = effect | print(s);
        }
        return effect;
    }

    public static boolean test2(String ... list) {
        boolean effect = false;
        for (String s : list) {
            effect = effect || print(s);
        }
        return effect;
    }

    public static void main(String ... args) {
        test("This", "little", "piggy");
        test2("This", "little", "piggy");
    }
}