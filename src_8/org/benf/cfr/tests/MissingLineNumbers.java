package org.benf.cfr.tests;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Map.Entry;

public class MissingLineNumbers {

    public static Date parseDate(String s) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(s);
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static <K, V> void forEach(Map<K, V> map) {
        for (Entry<K, V> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}
