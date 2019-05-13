package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 26/03/2014
 * Time: 16:36
 */
public class LoopTest51 {
    public static void dump(int length, long offset, int index) {
        for (int j= index; j < length; j+=16) {
            System.out.println(j);
        }
    }
}
