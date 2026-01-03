public class Abstraction{
    public static void main(String args[]){
        Horse h = new Horse();
        Bird b = new Bird();
        // b.walk();
    }
}

abstract class Animal {
    Animal() {
        System.out.println("Animal constructor called");
    }

    abstract void walk();
}

class Bird extends Animal {
    Bird() {
        System.out.println("Bird constructor called");
    }

    void walk(){
        System.out.println("Bird walk on 2 legs");
    }
}

class Horse extends Animal {
    Horse(){
        System.out.println("Horse constructor called");
    }

    void walk(){
        System.out.println("Horse walk on 4 legs");
    }
}