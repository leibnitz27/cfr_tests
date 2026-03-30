package org.benf.cfr.tests;

// Array type patterns and other reference type patterns in switch
public class PatternSwitch21 {

    static String arraySwitch(Object obj) {
        return switch (obj) {
            case int[] ia -> "int array len=" + ia.length;
            case String[] sa -> "string array len=" + sa.length;
            case long[] la -> "long array len=" + la.length;
            case Object[] oa -> "object array len=" + oa.length;
            case String s -> "string: " + s;
            case null, default -> "other";
        };
    }

    static int sumIfIntArray(Object obj) {
        if (obj instanceof int[] arr) {
            int sum = 0;
            for (int v : arr) {
                sum += v;
            }
            return sum;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(arraySwitch(new int[]{1, 2, 3}));
        System.out.println(arraySwitch(new String[]{"a", "b"}));
        System.out.println(arraySwitch(new long[]{1L}));
        System.out.println(arraySwitch(new Double[]{1.0}));
        System.out.println(arraySwitch("hello"));
        System.out.println(arraySwitch(42));
        System.out.println(sumIfIntArray(new int[]{10, 20, 30}));
        System.out.println(sumIfIntArray("nope"));
    }
}
