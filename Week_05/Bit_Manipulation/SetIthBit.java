import java.util.Scanner;

public class SetIthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. : ");
        int n = sc.nextInt();
        System.out.print("Enter the position whose bit you want to change to one. (0 to 1) : ");
        int i = sc.nextInt();
        System.out.println("After changing the "+i+"th bit the no. is : "+setIthBit(n,i));
    }
    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }
}

// Output-
// Enter the no. : 10
// Enter the position whose bit you want to change to one. (0 to 1) : 2
// After changing the 2th bit the no. is : 14
