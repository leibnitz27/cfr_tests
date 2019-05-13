package org.benf.cfr.tests;

import java.text.SimpleDateFormat;

public class CastTest21 {
    void test2(String n, String n2, String n3) throws Exception {
        {
            Object o = new Object();
        }
        {
            SimpleDateFormat o = new SimpleDateFormat("d.M.yyyy");
            System.out.println(o.parse(n));
        }
    }
}
