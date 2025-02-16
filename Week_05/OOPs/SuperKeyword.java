public class SuperKeyword {
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.color);
    }
}

class Animal {
    String color;
    Animal() {
        System.out.println("animal constructor is called.");
    }
}

class Horse extends Animal {
    Horse() {
        super.color = "brown";
        // super();  //it will call the parent class constructor.
        System.out.println("horse constructor is called.");
    }
}

// Output-
// animal constructor is called.
// horse constructor is called.
// brown