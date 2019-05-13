package org.benf.cfr.tests;
import java.util.function.Supplier;

public class InnerClassTest53 {
    class Local{}
    void localBug(){
        Supplier<Local> s = new Supplier<Local>(){
            public Local get(){
                return new Local();
            }
        };
    }
}
