package org.benf.cfr.tests;

import java.util.Objects;

public class InstanceOfPatternTest1a {
    public static void test(Object obj) {

        if (obj instanceof Person){  //
            Person person1 = (Person)obj;
            int age = person1.getAge();
            System.out.println("Age is " + age);
        }

        if (obj instanceof Person person1){   //
            int age = person1.getAge();
            System.out.println("Age is " + age);
        }
        //System.out.println(person1.getAge());  person1 is not accessible here
    }

    private static class Person {
        public Person(int x) {}

        public int getAge() {
            return 3;
        }
    }
}