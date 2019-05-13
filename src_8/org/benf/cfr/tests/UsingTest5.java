package org.benf.cfr.tests;

import java.io.IOException;
import java.io.StringWriter;

public class UsingTest5 {
    public void testEnhancedTryEmpty() throws IOException {
        fred : {
         try {
            StringWriter writer = null;
            writer.write("This is only a test 1.");
            try (final StringWriter writer20 = new StringWriter()) {
                writer.write("This is only a test 2.");
            } finally {
                break fred;
            }
        }  finally {
            System.out.println("ARGH");
        }
        }
    }
}
