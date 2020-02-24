package org.benf.cfr.tests;

//  bug#92
class ThrowsClauseExact<E extends Exception> {
    public void testThrow() throws Exception, E, E, RuntimeException, RuntimeException { }

    public static void main(String... args) throws Exception {
        System.out.println(ThrowsClauseExact.class.getMethod("testThrow").getExceptionTypes().length);
    }
}