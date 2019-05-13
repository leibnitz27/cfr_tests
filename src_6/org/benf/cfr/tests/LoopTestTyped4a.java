package org.benf.cfr.tests;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * <p/>
 * NB: Gives an interesting example of pointless type generation!!!
 */
public class LoopTestTyped4a {

    public void test5(List<String> lst) {

        List<String> lst2 = new Dup<List<String>>().dupIt(lst);
        for (String s : lst2) {
            System.out.println(s);
        }
    }

    public class Dup<E> {
        public E dupIt(E arg) {
            return arg;
        }
    }

}
