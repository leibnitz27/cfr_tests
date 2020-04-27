package org.benf.cfr.tests;

public class ArithOpTest9 {
    public int cmp1(long a,long b) {
        return (int)Long.compare(a,b);
    }
    public int cmp2(long a,long b) {
        return (int)Long.compareUnsigned(a,b);
    }
    public int cmp3(float a,float b) {
        return (int)Float.compare(a,b);
    }
    public int cmp4(double a,double b) {
        return (int)Double.compare(a,b);
    }

    public void foo() {
        System.out.println(cmp1(23123123L, 123123131231L) +" " +
                cmp2(23123123L, 123123131231L)+
                cmp3(12.1f, 12.31f)+
                cmp4(13.12, 12.31)
        );
    }
}
