package org.benf.cfr.tests;

import java.io.IOException;
import java.io.StringWriter;

public class UsingTest4b {
    public void testEnhancedTryEmpty() throws IOException {
        fred: {
            try (final StringWriter writer = new StringWriter()) {
                writer.write("This is only a test 1.");
                try (final StringWriter writer20 = new StringWriter()) {
                    writer.write("This is only a test 2.");
                }
                catch (final IOException e1) {
                    e1.printStackTrace();
                }
                catch (final IllegalArgumentException e2) {
                    e2.printStackTrace();
                }
                finally {
                    System.out.println("Finally1");
                    break fred;
                }
            }
            finally {
                System.out.println("Finally2");
            }
        }
        System.out.println("done");
    }
}
