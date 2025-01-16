// Write a program to find the factorial of any number entered by the user.

import java.util.*;

public class Factorial_of_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : " );
        int number = sc.nextInt(), fact=1;

        for(int i = number; i > 0; i--) {
            fact = i * fact;
        }

        System.out.println("Factorial of "+number+" is : "+fact);
    }
}

// Output-
// Enter a number : 5 
// Factorial of 5 is : 120