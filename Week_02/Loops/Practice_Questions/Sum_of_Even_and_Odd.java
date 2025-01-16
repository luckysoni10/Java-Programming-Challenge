// Write a program that reads a set of integers, and then prints the sum of even and odd integers.

import java.util.*;

public class Sum_of_Even_and_Odd {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter a set of integers : ");
        int integer = sc.nextInt();
    
        int evenSum = 0, oddSum = 0, lastDigit;
    
        while ( integer > 0 ) {
            lastDigit = integer % 10;
            
            if(lastDigit % 2 == 0 ) {
                evenSum += lastDigit;
            }else {
                oddSum += lastDigit;
            }
    
            integer = integer / 10; 
        }
    
        System.out.println("The sum of the even integers is: " + evenSum+"\nThe sum of the odd integers is : "+oddSum);
    }
}

// Output-
// Enter a set of integers : 123490
// The sum of the even integers is: 6
// The sum of the odd integers is : 13