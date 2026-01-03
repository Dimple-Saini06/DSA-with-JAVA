public class Inheritance{
    public static void main(String args[]){
        Bird b = new Bird();
        b.eat();
    }
}

class Animal {
    void eat(){
        System.out.println("Eats");
    }
}

class Mammal extends Animal{
    void walk(){
        System.out.println("Walk");
    }
}

class Dog extends Mammal {
    void swim(){
        System.out.println("Swim");
    }
}

class Bird extends Mammal{
    void fly(){
        System.out.println("Fly");
    }
}
