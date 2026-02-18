package org.benf.cfr.tests;

public class LineNumbersInnerClasses {
    
    public void method1() {
        System.out.println("Test.method1");
    }
    
    public void method2() {
        System.out.println("Test.method2");
    }
    
    class Inner1 {
        
        public Inner1() {
            System.out.println("Inner1 constructor");
        }
        
        public void method1() {
            System.out.println("Inner1.method1");
        }
        
        public void method2() {
            System.out.println("Inner1.method2");
        }
    }

    public void method3() {
        System.out.println("Test.method3");
    }
    
    public void method4() {
        System.out.println("Test.method4");
    }

    class Inner3 {
        
        public Inner3() {
            System.out.println("Inner3 constructor");
        }
        
        public void method1() {
            System.out.println("Inner3.method1");
        }
        
        public void method2() {
            System.out.println("Inner3.method2");
        }
    }

    class Inner4 {
        
        public Inner4() {
            System.out.println("Inner4 constructor");
        }
        
        public void method1() {
            System.out.println("Inner4.method1");
        }
        
        public void method2() {
            System.out.println("Inner4.method2");
        }
    }

    public void method5() {
        System.out.println("Test.method5");
    }
    
    public void method6() {
        System.out.println("Test.method6");
    }
}
