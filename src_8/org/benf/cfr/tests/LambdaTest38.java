package org.benf.cfr.tests;

public class LambdaTest38 {
        public LambdaTest38(int a, String b) { }

        interface Factory {
            LambdaTest38 create(int a, String b);
        }

        public static void create(Factory factory) { }

        public static void main(String[] args) {
            create(LambdaTest38::new);
        }
}
