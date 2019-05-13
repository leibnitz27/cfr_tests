package org.benf.cfr.tests;

import java.lang.reflect.Field;

public class Quark14ConstantTypes {
    final Integer fieldInit2 = 42;
    final int fieldInit = 42;
    final String fieldInit3 = "42";
    final String fieldInit4;

    public Quark14ConstantTypes() {
        fieldInit4 = "42";
    }

    private interface Excepting {
        void doit() throws Exception;
    }

    static void call(Excepting x) {
        try {
            x.doit();
        } catch (Exception e) {

        }
    }

    static void set(Quark14ConstantTypes p, String field) throws Exception {
        Field f = Quark14ConstantTypes.class.getDeclaredField(field);
        f.setAccessible(true);
        call(() -> f.setInt(p, 9000));
        call(() -> f.set(p, "FOO"));
        call(() -> f.set(p, 9002L));
        call(() -> f.set(p, 9001));
    }

    @Override
    public String toString() {
        return "Quark14ConstantTypes{" +
                "fieldInit2=" + fieldInit2 +
                ", fieldInit=" + fieldInit +
                ", fieldInit3='" + fieldInit3 + '\'' +
                ", fieldInit4='" + fieldInit4 + '\'' +
                '}';
    }

    public static void main(String ... args) throws Exception {
        Quark14ConstantTypes q = new Quark14ConstantTypes();
        set(q, "fieldInit");
        set(q, "fieldInit2");
        set(q, "fieldInit3");
        set(q, "fieldInit4");
        System.out.println(q);
    }
}
