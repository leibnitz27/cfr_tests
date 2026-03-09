package org.benf.cfr.tests;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.function.IntFunction;

class LambdaAnonymousArray {

    public static void main(String ... args) {
        IntFunction<String[]> f = i -> new String[] {"a" + i};
        System.out.println(f.apply(args.length)[0]);
    }

}
