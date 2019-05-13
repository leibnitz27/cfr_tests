package org.benf.cfr.tests;

import java.io.IOException;
import java.io.StringWriter;

public class UsingTest3 {
    public void testEnhancedTryEmpty() throws IOException {
        try (final StringWriter writer = new StringWriter();) {
            writer.write("This is only a test 1.");
            fred: try (final StringWriter writer20 = new StringWriter()) {
                writer.write("This is only a test 2.");
                try (final StringWriter writer30 = new StringWriter()) {
                    try (final StringWriter writer40 = new StringWriter()) {
                        writer.write("This is only a test 3.");
                        try (final StringWriter writer50 = new StringWriter()) {
                            writer20.write(writer.toString());
                        }
                    } finally {
                        System.out.println("ARGH");
                    }
                } finally {
                    System.out.println("ARGH");
                }
            }  finally {
                System.out.println("ARGH");
            }
        }  finally {
            System.out.println("ARGH");
        }
    }
}
