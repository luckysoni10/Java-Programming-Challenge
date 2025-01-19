import java.util.*;
 
class Factorial {
    public static int factorial(int number) {
        int fact = 1;
        for(int i = number; i > 0; i--) {
            fact = i * fact;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. : ");
        int n1 = sc.nextInt();

        factorial(n1);
        System.out.println("Factorial of "+n1+" is : "+factorial(n1));
    }
}

// Output-
// Enter no. : 5
// Factorial of 5 is : 120