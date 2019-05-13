package org.benf.cfr.tests;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 12/02/2014
 * Time: 17:56
 */
public class PrecedenceTest9 {

    public boolean test1a(Object fred, int x, int y) {
        return (y == x) == (fred.getClass() == Object.class);
    }

    public boolean test1b(Object fred, int x, int y) {
        return fred.getClass() == Object.class == (y == x);
    }

    public boolean test2a(Object fred, boolean b) {
        return b == (fred.getClass() == Object.class);
    }

    public boolean test2b(Object fred, boolean b) {
        return fred.getClass() == Object.class == b;
    }

}
