package org.benf.cfr.tests;

import java.util.Objects;

public class InstanceOfPatternTest1 {
    public static void test(Object obj) {

              // Pre JDK 14
        if (obj instanceof Person) {
            int age = ((Person) obj).getAge();
            // use age to perform business logic
        }

        //JDK 14
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