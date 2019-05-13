package org.benf.cfr.tests;
import java.util.function.Supplier;

public class InnerClassTest52c {
    interface ILocal {};

    void localBug(){
        class Local implements ILocal{}
        Supplier<ILocal> s = new Supplier<ILocal>(){
            public Local get(){
                return new Local();
            }
        };
    }
}
