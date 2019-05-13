package org.benf.cfr.tests;

enum EnumTest12 {

    ONE(1),
    TWO(2, "Two"),
    THREE(3) {
        @Override
        public String toString() {
            return "THREE";
        }
    };

    public final int code;
    public final String name;

    private EnumTest12(final int code) {
        this(code, "NoName");
    }

    private EnumTest12(final int code, String name) {
        this.code = code;
        this.name = name;
    }
}
