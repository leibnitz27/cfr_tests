package org.benf.cfr.tests;

import java.lang.reflect.Method;

class VarArgsFlagTest {

    public static void main(String[] args) {
        for(Method m : VarArgsFlagTest.class.getDeclaredMethods()) {
            if(!"mymethod".equals(m.getName())) continue;
            System.out.println(m);
        }
    }

    // descriptor changed to java.lang.Class after compilation
    // CFR fails to decompile method
    static void mymethod(Byte ... a) {
    }

}