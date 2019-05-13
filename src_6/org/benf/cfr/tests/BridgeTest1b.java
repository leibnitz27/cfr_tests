package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 10/07/2013
 * Time: 14:56
 */
public class BridgeTest1b {
    // Simple test which generates a bridge method due to return type.
    public static class A<T> {
        public Object getT(T t) {
            return null;
        }
    }
    public static class  B extends A<String> {
        public Object getT(String s) {
            return null;
        }
    }
}
