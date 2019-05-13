package org.benf.cfr.tests;


/**
 * User: lee
 * Date: 05/05/2011
 */
public class AssignTest2a {
    private static long sid = 0;

    private final long id0;

    public AssignTest2a() {
        id0 = sid++;
        long y = sid;
    }

    public AssignTest2a(boolean b) {
        id0 = ++sid;
    }

}
