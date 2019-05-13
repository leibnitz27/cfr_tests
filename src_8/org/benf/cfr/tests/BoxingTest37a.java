package org.benf.cfr.tests;

import org.benf.cfr.tests.support.Blah;
import org.benf.cfr.tests.support.UnaryFunction;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 18/12/2012
 * Time: 07:22
 * <p/>
 * Test that some INSANE casting doesn't get lost!
 * Abe Crannaford
 */
public class BoxingTest37a {

    public void test1() {
        switch ((int)(Object)(UnaryFunction) Blah::new) {
            case 0:
                System.out.println("A");
                break;
            default:
                System.out.println("C");
        }
    }

}
