// Display all numbers entered by user except multiples of 10

import java.util.*;

public class Continue_Keyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.print("Enter a number : ");
            int number = sc.nextInt();

            if(number % 10 == 0) {
                continue;
            }

            System.out.println("User Entered : "+number);
        }
    }
}

// Output-
// Enter a number : 2
// User Entered : 2
// Enter a number : 45
// User Entered : 45
// Enter a number : 10
// Enter a number : 22
// User Entered : 22
// Enter a number : 50
// Enter a number : 20
// ...............n(Infinite loop)