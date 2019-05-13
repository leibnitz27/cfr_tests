package org.benf.cfr.tests;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.stream.Stream;

public class ThreadTest1 {
    public static void main(String ... args) {
        ExecutorService tpe =  Executors.newCachedThreadPool();
    }
}
