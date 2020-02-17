package org.benf.cfr.tests;

public class InstanceOfPatternTest5 {
    public int s;
    public int i;

    public void test(boolean bool, Object obj) {
        System.out.println(s);
        System.out.println(i);

        if (!(obj instanceof String s)){
            System.out.println(s);
            System.out.println(i);
        } else {
            System.out.println(s.length());
            System.out.println(i);
        }

        //System.out.println(person1.getAge());  person1 is not accessible here
    }
}