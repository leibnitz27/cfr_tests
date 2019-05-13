package org.benf.cfr.tests;

import java.util.function.Function;

public class LambdaIntersectTrait {
    public interface Thing {
        default void doThing() {
            System.out.println("thing");
        }
    }

    public interface Thong {
        default void doThang() {
            System.out.println("thong");
        }
    }

    public interface Thang extends Thong {
        default void doThang() {
            System.out.println("thang");
        }
    }

    public static void main(String ... args) {
        var x = (Function<Integer, Boolean> & Thing & Thang)i -> true;
        x.doThing();
        x.doThang();
        ((Thong)x).doThang();
    }
}
