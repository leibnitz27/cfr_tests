package org.benf.cfr.tests;

import java.io.*;
import java.util.Base64;

public class UsingTest9 {

    // CFR is unable to decompile method
    static void test(InputStream in, Base64.Decoder decoder) {
        try(InputStream is = decoder.wrap(in)) {
            for(;;) {
                int x = is.read();
                if(x == 0) break;
            }
        } finally {
            throw new Error("pass");
        }
    }
}
