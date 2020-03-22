package org.benf.cfr.tests;

//  bug#92
class ThrowsClauseExact2<EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE extends Exception> {
    public void testThrow() throws EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE { }

    public static void main(String... args) throws Exception{
        new ThrowsClauseExact2().testThrow();
    }
}