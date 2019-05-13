package org.benf.cfr.tests;

import java.util.ArrayList;

class Song2 extends ClassLoader {

    ArrayList<Class<?>> list = new ArrayList<>();

    void test(String s, byte[] b) {
        Object s2;
        if(getPackage(s) == null) {
            s2 = s + '.';
            System.out.println(s2);
        }
        try {
            s2 = defineClass(s, b, 0, b.length);
        } catch(ClassFormatError e) {
            return;
        }
        // CFR stores c as an Object and explicitly casts it to an Object
        list.add((Class<?>)s2);
    }

}