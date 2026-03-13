package org.tnsif.cap.c2tc.oops;

class Animal {   // Parent Class
}

class Dog extends Animal {   // Child Class
}

public class DemoOperator {

    public static void main(String[] args) {

        Dog objName = new Dog();

        // checking the object type
        System.out.println(objName instanceof Dog);
        System.out.println(objName instanceof Animal);
    }
}