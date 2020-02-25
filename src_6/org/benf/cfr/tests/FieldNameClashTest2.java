package org.benf.cfr.tests;

// from ovf
public class FieldNameClashTest2 {
    public static void greet(){
        new FieldNameClashTest2().new Visible().greet();
    }
    public void main(String[]a){ org.benf.cfr.tests.FieldNameClashTest2.greet();}

    class Visible {
        String FieldNameClashTest2 = "Foo";
        public void greet(){System.out.println(FieldNameClashTest2);}
        public void main(){ org.benf.cfr.tests.FieldNameClashTest2.greet();}
    }
}
