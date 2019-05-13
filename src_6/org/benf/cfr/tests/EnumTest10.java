package org.benf.cfr.tests;

enum EnumTest10 {
    VALUE(1) {
        {
            System.out.println(this + ": " + this.code);
        }
    };

    public final int code;

    private EnumTest10(final int code) {
        this.code = code;
    }
}
