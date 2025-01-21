// Write a java method to compute the sum of the digits in an integer.

import java.util.*;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int integer = sc.nextInt();

        System.out.println("sum of the digits is : "+sum(integer));
    }

    public static int sum (int integer) {
        int sum = 0;
        while(integer > 0 ) {
            int lastDigit = integer % 10; 
            sum += lastDigit;
            integer = integer / 10; 
        }
        return sum ;
    }
}

// Output - 
// Enter an integer: 12345
// sum of the digits is : 15