package org.benf.cfr.tests;

import java.util.function.Supplier;

public class ExceptionTest14 {
    public void bar(Throwable e) {
        System.out.println("BOBO");
    }

    public void bar(IllegalStateException e) {
        System.out.println("FOBO");
    }

    public void bar(IllegalArgumentException e) {
        System.out.println("MOBO");
    }

    public void foo(Supplier<Integer> f) {
        try {
            f.get();
        } catch (IllegalArgumentException | IllegalMonitorStateException e) {
            bar(e);
        } catch (IllegalStateException e) {
            bar(e);
        } catch (Throwable e) {
            bar(e);
        }
    }
}
