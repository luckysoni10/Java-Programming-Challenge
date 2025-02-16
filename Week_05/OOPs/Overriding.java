//Method Overriding - Run time polymorphism.
public class Overriding {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat(); //it will call child class function.
    }
}

class Animal {
    void eat() {
        System.out.println("Eats anything.");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("Eats grass.");
    }
}