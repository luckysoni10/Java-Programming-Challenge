import java.util.Scanner;

public class ClearRangeBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. : ");
        int n = sc.nextInt();
        System.out.print("Enter the range from LSB : ");
        int i = sc.nextInt();
        System.out.print("Enter the range from MSB : ");
        int j = sc.nextInt();
        System.out.println("Value after clear the bits from "+i+" to +"+j+" : "+clearRangeBits(n,i,j));
    }
    public static int clearRangeBits(int n, int i, int j) {
        int a = ((-1) << (j+1));
        int b = (1 << i) -1;
        int bitMask = a | b;
        return n & bitMask;
    }
}
// Output-
// Enter the no. : 10
// Enter the range from LSB : 2
// Enter the range from MSB : 4
// Value after clear the bits from 2 to +4 : 2
