package org.benf.cfr.tests;

public enum EnumTest13 {
    None {
        public Integer performCastAction(Integer orig, Integer tgtType) {
            return foo();
        }
    };

    private static Integer foo() {
        return 1;
    }

    public abstract Integer performCastAction(Integer orig, Integer tgtType);
}

