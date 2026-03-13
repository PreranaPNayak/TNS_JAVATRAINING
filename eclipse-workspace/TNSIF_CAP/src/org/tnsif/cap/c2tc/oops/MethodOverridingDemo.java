package org.tnsif.cap.c2tc.oops;

class Animalclass{
    void sound() {
        System.out.println("Animals can make sound");
    }
}

class Lion extends Animalclass{
    void sound() {
        System.out.println("Lion roars......");
    }
}

public class MethodOverridingDemo {

    public static void main(String[] args) {
    	
    	
    	Lion l = new Lion();
    	l.sound();
    	
        Animalclass ac = new Animalclass();
        ac.sound();
    }

}