package org.benf.cfr.tests;

import java.util.function.Consumer;

public class RunnableTidy {
    public Runnable leave(boolean polite) {
        Consumer<String> cons = polite ? System.out::println : x -> {};
        return polite ? () -> cons.accept("Goodbye") :  () -> {};
    }
}
