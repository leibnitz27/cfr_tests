package org.benf.cfr.tests;

import java.io.IOException;
import java.io.StringWriter;

public class UsingTest7 {
    public void testEnhancedTryEmpty() throws IOException {

        try (final StringWriter writer = new StringWriter();
             final StringWriter writer2 = new StringWriter()) {
            writer.write("This is only a test 2.");
            writer2.write("Also");
        } finally {
            System.out.println("WAAAA");
        }
    }
}
