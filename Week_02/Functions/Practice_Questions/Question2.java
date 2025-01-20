// Write a method named isEven that accepts an int argument. The method shoulld return true if the argument is even, or false otherwise. Also write a procgram to test your method.

import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a no. : ");
        int num = sc.nextInt();

        if( isEven(num)) {
            System.out.println("Given no. is even. ");
        } else {
            System.out.println("Given no. is not even");
        }
    }
    
    public static boolean isEven (int num) {
        if(num % 2 == 0 ) { 
            return true;
        } else {
            return false;            
        }
    }  
}

// Output-
// Enter a no. : 8
// Given no. is even.