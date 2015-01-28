package com.company;

import java.util.HashSet;
import java.util.Set;

public class Test4 {

    public static void test() {
        Person person1 = new Person();
        person1.setAge(25);
        person1.setName("Gleb");

        Person person2 = new Person(25, "Gleb");

        System.out.println(person1);
        System.out.println(person2);

        Set<Person> set = new HashSet<Person>();
        set.add(person1);
        set.add(person2);

        System.out.println(set);
    }

    public static class Parent {

        protected int age;
        protected String name;

        public Parent() {
        }

        public Parent(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

    public static class Person extends Parent {

        public String name;
        public int age;

        public Person() {
        }

        public Person(int age, String name) {
            super(age, name);
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "age=" + getAge() +
                    ", name='" + getName() + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Person)) return false;

            Person person = (Person) o;

            if (age != person.age) return false;
            if (name != null ? !name.equals(person.name) : person.name != null) return false;

            return true;
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + age;
            return result;
        }
    }

}
