package org.benf.cfr.tests;

import java.io.IOException;
import java.io.StringWriter;

public class EnhancedTryTestStrobel1 {
    public void testEnhancedTryEmpty() throws IOException {
        try (final StringWriter writer = new StringWriter()) {
            writer.write("This is only a test.");
        }
    }
}
