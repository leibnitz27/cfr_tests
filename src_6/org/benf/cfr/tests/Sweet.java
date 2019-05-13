package org.benf.cfr.tests;

class Sweet {
    static String test = "dummy";

    Sweet() {
    }

    public static void main(String[] arrstring) {
        StringBuilder stringBuilder = new StringBuilder().append(test);
        test = null;
        test = null;
        String string = stringBuilder.append((String)null).toString();
        test = string;
        test = string;
        test = Sweet.something(string);
    }

    static String something(String string) {
        System.out.println(test);
        return string;
    }
}
