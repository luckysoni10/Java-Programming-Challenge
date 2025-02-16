//Hybrid Inheritance.
public class HybridInheritance {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.bark();
        d1.walk();
        d1.eat();

        Lion l1 = new Lion();
        l1.roar();
        l1.walk();
        l1.breathe();

        Peacock p1 = new Peacock();
        p1.fly();
        p1.eat();
        p1.dance();

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

class Mammal extends Animal {
    void walk () {
        System.out.println("Walk.");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("Dog can bark.");
    }
}

class Lion extends Mammal {
    void roar() {
        System.out.println("Lion can roar.");
    }
}

class Bird extends Animal {
    void fly () {
        System.out.println("Fly.");
    }
}

class Peacock extends Bird {
    void dance() {
        System.out.println("Peacock can dance.");
    }
}

// Output-
// Dog can bark.
// Walk.
// Eats.
// Lion can roar.
// Walk.
// Breathe.
// Fly.
// Eats.
// Peacock can dance.