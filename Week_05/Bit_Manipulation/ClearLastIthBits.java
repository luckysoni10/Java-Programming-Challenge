import java.util.Scanner;

public class ClearLastIthBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. : ");
        int n = sc.nextInt();
        System.out.print("Enter the range from left : ");
        int i = sc.nextInt();
        System.out.println("Value after clear the "+i+"th bit from last : "+clearLastIthBits(n,i));
    }
    public static int clearLastIthBits(int n, int i) {
        int bitMask = ((-1)<<i);
        return n & bitMask;
    }
}

// Output-
// Enter the no. : 15      
// Enter the range from left : 2
// Value after clear the 2th bit from last : 12
