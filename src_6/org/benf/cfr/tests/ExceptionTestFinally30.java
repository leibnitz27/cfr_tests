package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 10/03/2014
 * Time: 17:11
 */
public class ExceptionTestFinally30 {
    public void foo() throws Exception {
        boolean b = true;
        try {
            throw new Exception();
        } catch (Exception e) {
            b = false;
        } finally {
            try {
                throw new Exception();
            } catch (Exception e2) {
                b = true;
            }
            if (b) throw new Exception("");
        }
        if (!b) throw new Exception("");
    }
}
