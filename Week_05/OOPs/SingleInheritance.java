//Single Level Inheritance
public class SingleInheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
        shark.swim();
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
class Fish extends Animal {
    int fins;

    void swim () {
        System.out.println("Swims.");
    }
}

// Output-
// Eats.
// Swims.