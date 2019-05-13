package org.benf.cfr.tests;

import java.util.ArrayList;

class Song extends ClassLoader {

    ArrayList<Class<?>> list = new ArrayList<>();

    void test(String s, byte[] b) {
        if(getPackage(s) == null) {
            String s2 = s + '.';
            System.out.println(s2);
        }
        Class<?> c;
        try {
            c = defineClass(s, b, 0, b.length);
        } catch(ClassFormatError e) {
            return;
        }
        // CFR stores c as an Object and explicitly casts it to an Object
        list.add(c);
    }

}