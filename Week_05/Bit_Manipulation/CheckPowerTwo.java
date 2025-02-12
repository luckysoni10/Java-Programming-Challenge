//Check if a number is a power of 2 or not.
import java.util.*;
public class CheckPowerTwo {
    public static void main(String[] args) {
        System.out.print("Enter a no. to check wheater it is a power of two or not : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isPowerTwo(n)) {
            System.out.println("No. is power of two..");
        } else {
            System.out.println("No. is not the power of two..!");
        }
    }
    public static boolean isPowerTwo (int n) {
        return ( n & (n-1) ) == 0;
    }
}

// Output-
// Enter a no. to check wheater it is a power of two or not : 8
// No. is power of two..

