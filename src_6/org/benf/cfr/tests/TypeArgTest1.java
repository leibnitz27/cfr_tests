package org.benf.cfr.tests;

public class TypeArgTest1 {
        private static final String TEST = "src/Test.java";

        public static void main(final String[] args) {
            System.out.println(TEST.substring(TEST.indexOf('/') + 1, TEST.indexOf('.')));
        }
}
