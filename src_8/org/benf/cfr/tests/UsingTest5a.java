package org.benf.cfr.tests;

import java.io.IOException;
import java.io.StringWriter;

public class UsingTest5a {
    public void testEnhancedTryEmpty() throws IOException {
       try {
            try (final StringWriter writer20 = new StringWriter()) {
                writer20.write("This is only a test 2.");
            }
        }  finally {
            System.out.println("ARGH");
        }
    }
}
