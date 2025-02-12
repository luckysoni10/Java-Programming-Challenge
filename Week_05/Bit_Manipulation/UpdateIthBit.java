import java.util.Scanner;

public class UpdateIthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. : ");
        int n = sc.nextInt();
        System.out.print("Enter the position where you want to make change : ");
        int i = sc.nextInt();
        System.out.print("Enter the new bit : ");
        int newBit = sc.nextInt();
        System.out.println("Updated Value is : "+updateIthBit(n,i,newBit));
    }
    public static int updateIthBit(int n, int i, int newBit) {
        int bitMask=0;
        if(newBit == 0) {
            //clear the bit
            bitMask = ~(1<<i);
            return n & bitMask;
        } else {
            //set the bit
            bitMask = 1<<i;
            return n | bitMask;
        }
    }
}

// Output-
// Enter the no. : 10
// Enter the position where you want to make change : 2
// Enter the new bit : 1
// Updated Value is : 14