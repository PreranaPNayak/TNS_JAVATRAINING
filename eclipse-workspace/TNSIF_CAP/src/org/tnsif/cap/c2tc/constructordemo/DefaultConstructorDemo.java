package org.tnsif.cap.c2tc.constructordemo;

class User
{
    String name;
    int age;

    // Default Constructor
    User()
    {
        name = "Prerana";
        age = 21;
        System.out.println("Default Constructor:");
        System.out.println("Name: " + name + "\nAge: " + age);
    }

    // Parameterized Constructor
    User(String name, int age)
    {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized Constructor:");
        System.out.println("Name: " + name + "\nAge: " + age);
    }
}

public class DefaultConstructorDemo
{
    public static void main(String[] args)
    {
        User obj1 = new User();              // calls default constructor
        User obj2 = new User("Rahul", 25);   // calls parameterized constructor
    }
}