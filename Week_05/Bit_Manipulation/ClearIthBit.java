import java.util.*;
public class ClearIthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. : ");
        int n = sc.nextInt();
        System.out.print("Enter the position whose bit you want to make zero : ");
        int i = sc.nextInt();
        System.out.println("Value after clear the "+i+"th bit : "+clearIthBit(n,i));
    }
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
}

// Output-
// Enter the no. : 10
// Enter the position whose bit you want to make zero : 1
// Value after clear the 1th bit : 8