package org.benf.cfr.tests;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Quark14ConstantStatic {
    final static int instanceInit;
    final static int fieldInit = 42;
    final static int constructorInit;
    final static int cmpFieldInit1 = 0 + fieldInit;
    final static int cmpFieldInit2 = fn();

    public static int fn() {
        return 42;
    }

    static {
        instanceInit = 42;
        constructorInit = 42;
    }

    public Quark14ConstantStatic() {

    }

    static void set(Quark14ConstantStatic p, String field) {
        try {
            Field f = Quark14ConstantStatic.class.getDeclaredField(field);
            f.setAccessible(true);
            Field modifiersField = Field.class.getDeclaredField( "modifiers" );
            modifiersField.setAccessible( true );
            modifiersField.setInt( field, f.getModifiers() & ~Modifier.FINAL );
            f.setInt(null, 9000);
        } catch (Exception e) {

        }
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
        Quark14ConstantStatic q = new Quark14ConstantStatic();
        set(q, "fieldInit");
        set(q, "instanceInit");
        set(q, "constructorInit");
        set(q, "cmpFieldInit1");
        set(q, "cmpFieldInit2");
        System.out.println(q);
    }
}
