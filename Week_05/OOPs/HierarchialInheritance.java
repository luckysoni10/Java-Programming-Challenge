//Hierarchial Inheritance.
public class HierarchialInheritance {
    public static void main(String[] args) {
        Mammal dog = new Mammal();
        dog.eat();
        dog.walk();

        Fish shark = new Fish();
        shark.swim();
        shark.breathe();

        Bird sparrow = new Bird();
        sparrow.fly();
        sparrow.eat();
    }
}

//Base Class
class Animal {
    String color;
    void eat () {
        System.out.println("Eats.");
    }

    void breathe () {
        System.out.println("Breathe.");
    }
}

//Derived Class 
class Mammal extends Animal {
    void walk () {
        System.out.println("Walk.");
    }
}

//Derived Class 
class Bird extends Animal {
    void fly () {
        System.out.println("Fly.");
    }
}

//Derived Class 
class Fish extends Animal {
    void swim () {
        System.out.println("Swim.");
    }
}

// Output-
// Eats.
// Walk.
// Swim.
// Breathe.
// Fly.
// Eats.
