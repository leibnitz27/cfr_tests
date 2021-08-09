package org.benf.cfr.tests;

public sealed interface SealedInterface {
    void doIt();

    public final class A implements SealedInterface {
        public void doIt() {}
    }

    public non-sealed class B implements SealedInterface {
        public void doIt() {}
    }
}
