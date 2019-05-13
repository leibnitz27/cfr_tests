package org.benf.cfr.tests;

import java.lang.reflect.Field;

public class Quark14ConstantDbl {
    final double instanceInit;
    final double fieldInit = 42;
    final double constructorInit;
    final double cmpFieldInit1 = 0 + fieldInit;
    final double cmpFieldInit2 = fn();

    public static int fn() {
        return 42;
    }

    {
        instanceInit = 42;
    }

    public Quark14ConstantDbl() {
        constructorInit = 42;
    }

    static void set(Quark14ConstantDbl p, String field) throws Exception {
        Field f = Quark14ConstantDbl.class.getDeclaredField(field);
        f.setAccessible(true);
        f.setDouble(p, 9000);
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
        Quark14ConstantDbl q = new Quark14ConstantDbl();
        set(q, "fieldInit");
        set(q, "instanceInit");
        set(q, "constructorInit");
        set(q, "cmpFieldInit1");
        set(q, "cmpFieldInit2");
        System.out.println(q);
    }
}
