package org.tnsif.cap.c2tc.oops;

public class AfterEncapsulation {

    private static int age;
    private static String name;

    public static void setAge(int age) {
        AfterEncapsulation.age = age;
    }

    public static void setName(String name) {
        AfterEncapsulation.name = name;
    }

    public static int getAge() {
        return age;
    }

    public static String getName() {
        return name;
    }

    public static void main(String[] args) {

        setAge(20);
        setName("Prerana");

        System.out.println(getAge());
        System.out.println(getName());
    }
}