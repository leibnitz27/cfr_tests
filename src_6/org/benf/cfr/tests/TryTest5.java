package org.benf.cfr.tests;

import java.io.IOException;
import java.io.StringWriter;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 18:48
 * To change this template use File | Settings | File Templates.
 */
public class TryTest5 {

    public void functionWhichMightThrow() {
    }

    public boolean test() {
        return false;
    }

    public void foo()  {
        do {
            do {
                try {
                    functionWhichMightThrow();
                } catch (Exception e) {
                    break;
                }
            } while (test());
            System.out.println("A");
        } while (true);
    }
}
