package org.benf.cfr.tests;

enum EnumTest11 {

    ONE(1),
    TWO(2, "Two");

    public final int code;
    public final String name;

    private EnumTest11(final int code) {
        this(code, "NoName");
    }

    private EnumTest11(final int code, String name) {
        this.code = code;
        this.name = name;
    }
}
