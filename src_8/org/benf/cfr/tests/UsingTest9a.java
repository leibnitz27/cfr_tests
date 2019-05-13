package org.benf.cfr.tests;

import java.io.*;
import java.util.Base64;

public class UsingTest9a {

    // CFR is unable to decompile method
    static void test(InputStream in, PrintWriter out) throws IOException {
        Base64.Decoder decoder = Base64.getDecoder();
        try(InputStream is = decoder.wrap(in);
            Reader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr)) {
            for(;;) {
                String line = br.readLine();
                if(line == null) break;
                out.println(line);
            }
        }
    }
}
