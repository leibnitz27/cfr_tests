package org.benf.cfr.tests;

import java.lang.reflect.Field;

public class Quark14NonConstant {
    int instanceInit;
    int fieldInit = 42;
    int constructorInit;
    int cmpFieldInit1 = 0 + fieldInit;
    int cmpFieldInit2 = fn();

    public static int fn() {
        return 42;
    }

    {
        instanceInit = 42;
    }

    public Quark14NonConstant() {
        constructorInit = 42;
    }

    static void set(Quark14NonConstant p, String field) throws Exception {
        Field f = Quark14NonConstant.class.getDeclaredField(field);
        f.setAccessible(true);
        f.setInt(p, 9000);
    }

    @Override
    public String toString() {
        return "Quark14Constant{" +
                "instanceInit=" + instanceInit +
                ", fieldInit=" + fieldInit +
                ", constructorInit=" + constructorInit +
                ", cmpFieldInit1=" + cmpFieldInit1 +
                ", cmpFieldInit2=" + cmpFieldInit2 +
                '}';
    }

    public static void main(String ... args) throws Exception {
        Quark14NonConstant q = new Quark14NonConstant();
        set(q, "fieldInit");
        set(q, "instanceInit");
        set(q, "constructorInit");
        set(q, "cmpFieldInit1");
        set(q, "cmpFieldInit2");
        System.out.println(q);
    }
}
