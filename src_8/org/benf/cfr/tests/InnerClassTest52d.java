package org.benf.cfr.tests;
import java.util.function.Supplier;

public class InnerClassTest52d {
    void localBug(){
        class Local{}
        Supplier<Local> s = new Supplier<Local>(){
            public Local get(){
                return new Local();
            }
        };
        Local l1 = new Local();
    }
}
