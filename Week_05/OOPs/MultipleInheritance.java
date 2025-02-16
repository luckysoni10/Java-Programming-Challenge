//Multiple Inheritance through Interface.
public class MultipleInheritance {
    public static void main(String[] args) {
        Bear bear = new Bear();
        bear.eatPlants();
        bear.eatMeat();
    }
}


interface Herbivore {
    void eatPlants();
}

interface Carnivore {
    void eatMeat();
}

class Bear implements Herbivore, Carnivore {
    public void eatPlants() {
        System.out.println("Bear eats plants.");
    }

    public void eatMeat() {
        System.out.println("Bear eats meat.");
    }
}

// Output-
// Bear eats plants.
// Bear eats meat.