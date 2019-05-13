package org.benf.cfr.tests;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.function.Consumer;

public class NotNullTest {
    private Consumer<String> s;

    public NotNullTest() {
        s = System.out::println;
    }
}
