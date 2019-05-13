package org.benf.cfr.tests;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * <p/>
 * NB: Gives an interesting example of pointless type generation!!!
 */
public class LoopTestTyped7a {

    public void foo() {
        List<String> lst = new ArrayList<String>();
        for (String s : lst) {
            System.out.println(s);
        }
    }

}
