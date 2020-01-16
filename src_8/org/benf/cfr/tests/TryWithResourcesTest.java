package org.benf.cfr.tests;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TryWithResourcesTest {
    public int test() {
        try (InputStream is = getClass().getResourceAsStream("file")) {
            try (InputStreamReader r = new InputStreamReader(is)) {
                return doSomething();
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private int doSomething() {
        return 1;
    }
}