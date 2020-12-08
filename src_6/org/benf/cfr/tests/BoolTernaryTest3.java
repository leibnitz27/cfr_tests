package org.benf.cfr.tests;
// https://github.com/leibnitz27/cfr/issues/217
public class BoolTernaryTest3 {

    public static boolean c(String... values) {
        return false;
    }

    public boolean isValid(int x) {
        return false;
    }

    protected int broken(int x) {
        int i = 0;
        boolean a = isValid(x) && c("test");
        boolean b = isValid(x + 1);

        if (a) {
            i = 0;
        } else if (b) {
            i = 1;
        }
        return i;
    }
}
