public class Operators {
    public static void main(String[] args) {
        
    // Arithmetic Operators
        // 1. Binary Operatoers

        int a = 10;
        int b = 20;
        System.out.println("Addition :" + (a+b)); // Addition :30

        System.out.println("Substraction :" + (a-b)); // Substraction :-10

        System.out.println("Multiplication :" + (a*b));  // Multiplication :200

        System.out.println("Division :" + (a/b));  // Division :0

        System.out.println("Modules :" + (a%b)); // Modules :10

        
        //2. Unary 
            // a. Pre increment 
            int c = 10;
            int d = ++c;
            System.out.println("Pre Increment : "+d); //  Pre Increment : 11

            // b. Post increment
            int e = 10;
            int f = e++;
            System.out.println("Post Increment :"+f);  // Post Increment :10

            // Pre Decrement & Post Decrement similar to this.


    // Relational Operators

    int x = 20;
    int y = 20;

    System.out.println(x==y); //true

    System.out.println((x!=y)); //false

    System.out.println((x>y)); //false

    System.out.println((x<y)); //false

    System.out.println((x<=y)); //true

    System.out.println((x>=y)); //true

    
    // Logical Operators

        // a. Logical AND          
        System.out.println((5==2) && (5>2)); //false
        System.out.println((2==2) && (2!=4)); //true

        // b. Logical OR
        System.out.println((5==2) && (5>2)); //false
        System.out.println((2==2) && (2!=4)); //true

        // c. Logical NOT
        System.out.println(!false); //true
        System.out.println(!(4>2)); //false
    
    // Assignment Operators
    int l= 5;

    l += 10; // l = l + 10; 
    System.out.println(l); // 15

    l *= 2;
    System.out.println(l); // 30

    l /= 2;
    System.out.println(l); // 15

    l -= 10;
    System.out.println(l); // 5
 
    }
}