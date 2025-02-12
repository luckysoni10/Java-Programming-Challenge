import java.util.*;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. : ");
        int n = sc.nextInt();
        evenOdd(n);
    }
    public static void evenOdd(int n) {
        int bitMask = 1;
        if((n & bitMask) == 0) {
            System.out.println("Even no.");
        } else {
            System.out.println("Odd no.");
        }
    }
}

// Output-
// Enter the no. : 5
// Odd no.
