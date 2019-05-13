package org.benf.cfr.tests;

import java.io.IOException;
import java.io.StringWriter;

public class UsingTest4a {
    public void testEnhancedTryEmpty() throws IOException {
        fred: try (final StringWriter writer = new StringWriter()) {
            writer.write("This is only a test 1.");
            try (final StringWriter writer20 = new StringWriter()) {
                writer.write("This is only a test 2.");
            } finally {
                System.out.println("Finally1");
            }
        }  finally {
            System.out.println("Finally2");
        }
    }
}
