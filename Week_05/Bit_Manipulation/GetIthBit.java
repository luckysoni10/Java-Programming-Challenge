// Get ith bit, set ith bit, clear ith bit.
import java.util.*;
public class GetIthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. : ");
        int n = sc.nextInt();
        System.out.print("Enter the position whose bit you want : ");
        int i = sc.nextInt();
        System.out.println(i+"th position bit is : "+getIthBit(n,i));
    }
    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }
}

// Output-
// Enter the no. : 10
// Enter the position whose bit you want : 2
// 2th position bit is : 0
