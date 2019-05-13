package org.benf.cfr.tests;
import java.util.function.Supplier;

public class InnerClassTest52b {
    void localBug(){
        class Local{}
        Supplier<Local> s = Local::new;
    }
}
