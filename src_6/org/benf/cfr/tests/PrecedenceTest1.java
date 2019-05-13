package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 12/02/2014
 * Time: 17:56
 */
public class PrecedenceTest1 {
    public int test1() {
        return new String("fred").hashCode();
    }

    public int test2() {
        return (new String("fred")).hashCode();
    }
}
