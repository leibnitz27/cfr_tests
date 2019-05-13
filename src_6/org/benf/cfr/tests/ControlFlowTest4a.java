package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 06:28
 * <p/>
 * http://www.program-transformation.org/Transform/DecompilerControlFlowTestSource
 * <p/>
 * (some decompilers fail to get the inner while.  (cfr did at 0_3).
 */
public class ControlFlowTest4a {
    public int foo(int i, int j) {
        while (true) {
            System.out.println("fred");
            try {
                while (i < j)
                    i = j++ / i;
            } catch (RuntimeException re) {
                if (i < 2) {
                    i = i + 1;
                }
                if (i > 5) continue;
            }
            break;
        }
        return j;
    }
}
