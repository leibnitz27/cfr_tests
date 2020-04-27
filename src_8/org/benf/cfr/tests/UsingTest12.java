package org.benf.cfr.tests;

import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;

public class UsingTest12 {
    public static String decompileFail2(Throwable t) throws Exception {
        try (final ByteArrayOutputStream stream = new ByteArrayOutputStream(1024); PrintWriter writer = new PrintWriter(stream)) {

            t.printStackTrace(writer);

            writer.flush();
            stream.flush();

            return stream.toString();
        } catch (NullPointerException ignored) {
            return t.toString();
        }
    }
}
