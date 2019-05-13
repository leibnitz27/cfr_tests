package org.benf.cfr.tests;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * <p/>
 * NB: Gives an interesting example of pointless type generation!!!
 */
public class LoopTestTyped7c {

    public void foo() {
        List lst = new ArrayList();
        for (Object s : lst) {
            System.out.println((String)s);
        }
    }

}
