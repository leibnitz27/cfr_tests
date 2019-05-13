package org.benf.cfr.tests;

import java.io.IOException;
import java.io.StringWriter;

public class UsingTest2b {
    public void testEnhancedTryEmpty() throws IOException {
        try (final StringWriter writer = new StringWriter()) {
            writer.write("This is only a test.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
