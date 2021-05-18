package org.benf.cfr.tests;

public class ExceptionTest16 {

    public void run() throws InterruptedException {
        try {
            doSomethingCanThrowExceptions();
        } catch (InterruptedException ex) {
            throw ex;
        } catch (Exception ex) {
            doSomething();
        } finally {
            System.out.println(String.format("%s", "abcd"));
        }
    }

    private void doSomething() {
    }

    // minimized, but assume method could throw any exception
    private void doSomethingCanThrowExceptions() throws Exception {
    }
}
