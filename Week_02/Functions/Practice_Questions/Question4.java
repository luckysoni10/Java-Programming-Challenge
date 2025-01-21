// Write a java program to check if a number is a palindrome in java?
import java.util.*;

class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a no. : ");
        int number = sc.nextInt();

        if(isPalindrom(number)) {
            System.out.println(number + " is a palindrome number");
        } else {
            System.out.println(number + " is not a palindrome number");
        }
    }

    public static boolean isPalindrom (int num ) {
        int number = num;
        int reverse = 0;
        while(number > 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;
        }
        
        if(reverse == num) {
            return true;
        } else {
            return false;
        }
    }
}

// Output- 
// Enter a no. : 121
// 121 is a palindrome number