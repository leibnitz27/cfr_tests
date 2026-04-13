package org.benf.cfr.tests;

import java.util.Objects;

public class InstanceOfPatternTest1b {
    public static void test(Object obj) {

        Person person1;
        if (obj instanceof Person){  //
            person1 = (Person)obj;
            int age = person1.getAge();
            System.out.println("Age is " + age);
        }

        if (obj instanceof Person){   //
            person1 = (Person)obj;
            int age = person1.getAge();
            System.out.println("Age is " + age);
        }
    }

    private static class Person {
        public Person(int x) {}

        public int getAge() {
            return 3;
        }
    }
}