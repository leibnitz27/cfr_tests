package org.benf.cfr.tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 26/03/2014
 * Time: 16:36
 */
public class LoopTest58 {
    public void test(int a, int b) {
        if (a < b) {
            for (int c = a;c<b;++c) {
                System.out.print("s");
                if (c < b) continue;
                System.out.print("s2");
                break;
            }
        } else {
            System.out.print(a);
        }
        System.out.println("Done");
    }
}
