import java.util.*;

public class Reverse_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a no. ");
        int number = sc.nextInt();

        int reverse = 0, lastNo;

        while(number > 0) {
            lastNo = number % 10; //get the last digit of the number.
            reverse = (reverse * 10) + lastNo; //adding last digit to the reverse number
            number = number / 10; //after the operation updating the original number
        }
        System.out.println("Reverse number is : "+reverse );
    }
}

// Output-
// enter a no. 657654164
// Reverse number is : 461456756