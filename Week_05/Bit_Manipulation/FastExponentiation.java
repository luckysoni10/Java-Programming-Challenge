//Fast Exponentation - a^n can be solve in O(log n) complexity.
import java.util.*;
public class FastExponentiation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. : ");
        int a = sc.nextInt();
        System.out.print("Enter the power. : ");
        int n = sc.nextInt();
        System.out.println(a+"^"+n+" is : "+fastExpo(a,n));
    }
    public static int fastExpo(int a, int n) {
        int ans = 1;
        while(n > 0) {
            if((n & 1) != 0) { //check LSB
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }
}

// Output-
// Enter a no. : 3
// Enter the power. : 5
// 3^5 is : 243
