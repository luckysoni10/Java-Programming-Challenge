//Question- Count Set Bits in a Number.
import java.util.*;
public class CountSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. : ");
        int n = sc.nextInt();
        System.out.println("Count of 1's is : "+countOnces(n));
    }
    public static int countOnces(int n) {
        int count = 0;
        while(n > 0) {
            if((n & 1) != 0) { //checking LSB
                count++;
            }
            n = n >> 1; //right shift
        }
        return count;
    }
}

// Output-
// Enter the no. : 15
// Count of 1's is : 4