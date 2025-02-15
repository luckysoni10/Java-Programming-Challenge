public class Constructor {
    public static void main(String[] args) {
        Name n1 = new Name(); //Non Parameterized constructor
        Name n2 = new Name("lucky"); //Parameterized constructor
    }
}
class Name {
    String name;
    int phone;

    Name() {
        System.out.println("Constructor is called..");
    }

    Name(String name) {
        this.name = name;
        System.out.println("Name : "+name);
    }
    
}
