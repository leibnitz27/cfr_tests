package org.benf.cfr.tests;

class Variance {

    public static void main(String[] args) {
        // CFR misses Object cast, causing arguments to be passed incorrectly
        safe(3, (Object)new String[]{"one"});
        safe(3, new String[]{"one"});
    }

    public static void safe(int i, Object... args) {
        System.out.println(((Object[])args[0])[0]);
    }

}
