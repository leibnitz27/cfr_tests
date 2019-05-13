package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 26/03/2014
 * Time: 16:36
 */
public class LoopTest52 {
    public static void dump(int length, long offset, int index) {
        if (offset == 1) {
            while (index < length) {
                System.out.println(index++);
                offset++;
            }
        }
        System.out.println("Done");
    }
}
