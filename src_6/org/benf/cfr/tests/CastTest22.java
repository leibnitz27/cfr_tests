package org.benf.cfr.tests;

import java.text.SimpleDateFormat;

public class CastTest22 {
    void test2(String n, String n2, String n3) throws Exception {
            Object s1 = new SimpleDateFormat("d.M.yyyy");
            String string = n + "." + n2 + "." + n3;
            System.out.println(((SimpleDateFormat)s1).parse(string));
    }
}
