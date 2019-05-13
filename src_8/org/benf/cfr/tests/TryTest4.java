package org.benf.cfr.tests;

import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 18:48
 * To change this template use File | Settings | File Templates.
 */
public class TryTest4 {

    public void foo() throws IOException {
        try (final StringWriter sw = new StringWriter()) {
            sw.write("test");
        }

    }
}
