public class MultiLevelInheritance {
    public static void main(String[] args) {
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);
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
    int legs;
}

//Derived Class 
class Dog extends Mammal {
    int breed;
}

// Output-
// Eats.
// 4