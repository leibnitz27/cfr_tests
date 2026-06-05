package org.benf.cfr.tests;

public class RecordPattern1b {
    void foo(Object o) {
        System.out.println("before");
        if (o instanceof RecordLine21 var2_2) {
            RecordPoint21 recordPoint21;
            RecordPoint21 a = recordPoint21 = var2_2.start();
            RecordPoint21 b = recordPoint21 = var2_2.end();
            System.out.println((Object)a);
            System.out.println((Object)b);
        }
        System.out.println("after");
    }
}
