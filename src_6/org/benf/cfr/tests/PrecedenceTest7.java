package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 12/02/2014
 * Time: 17:56
 */
public class PrecedenceTest7 {

    public int test1(Object fred, int x) {
        return (((String[])fred)[x]).length();
    }
}
