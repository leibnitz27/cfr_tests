package org.benf.cfr.tests;

public class AssignExprTest2 {
    // Section 15.26.2 - the LHS is evaluated FIRST, then the RHS.
    // This means that assignments in the RHS are not effective.
    public static int assign2(int a, int b, int c) {
        a |= 2;
        return a +=2;
    }

}
