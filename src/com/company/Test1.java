package com.company;

public class Test1 {

    public static void test() {
        Person person = new Person("Oleg", 21);
        System.out.println(person);
    }

    public static class Рerson {

        private int age;
        private String name;

        public Рerson(String name, int age) {
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

}
