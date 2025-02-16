public class AbstractClass {
    public static void main(String[] args) {
        Mustang m = new Mustang();
        // when we will create the instance of mustang it will call its parent constructors.
        // animal -> horse -> mustang
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color); //by default it will print black.

        Chicken c = new Chicken ();
        c.eat();
        c.walk();
        c.changeColor();
        System.out.println(c.color);
        // Animal a = new Animal(); //can not create the instance of abstract class.
    }
}

abstract class Animal {
    String color;

    Animal() { //we can create the constructor of abstract class.
        color = "black";
        System.out.println("Animal constructor called.");
    }

    void eat () {
        System.out.println("animal eats.");
    }

    abstract void walk(); //give only the idea.
}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse constructor called.");
    }
    void walk() { //implenting the idea
        System.out.println("walks on 4 legs.");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang Constructor called.");
    }
}

class Chicken extends Animal {
    void changeColor() {
        color = "white"; //we can change the color.
    }
    void walk() {
        System.out.println("walks on 2 legs");
    }
}

// Output-
// Animal constructor called.
// Horse constructor called.
// Mustang Constructor called.
// Animal constructor called.
// Horse constructor called.
// animal eats.
// walks on 4 legs.
// black
// Animal constructor called.
// animal eats.
// walks on 2 legs
// white