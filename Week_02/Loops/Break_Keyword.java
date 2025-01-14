// Take a number from user until he entered the multiple of 10.

import java.util.*;

public class Break_Keyword {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        do {
            System.out.print("Enter your number : ");
            int n = sc.nextInt();
    
            if( n % 10 == 0) {
                break;
            }
            System.out.println("Entered No. is : " +n);
        } while(true);
        
    }
}

// Output-
// Enter your number : 4
// Entered No. is : 4
// Enter your number : 5
// Entered No. is : 5
// Enter your number : 45
// Entered No. is : 45
// Enter your number : 50 
