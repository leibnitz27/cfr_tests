package org.benf.cfr.tests;

import java.security.SecureRandom;

// Samuel Dennis Borlongan
public class LambdaTest15b {
    public static void main(String ... arguments) {
        String [] res = new SecureRandom().longs()
                .limit(10L)
                .parallel()
                .mapToObj(String::valueOf)
                .map(String::intern)
                .toArray(x -> new String[x])
        ;
        int x = 1;
    }
}
