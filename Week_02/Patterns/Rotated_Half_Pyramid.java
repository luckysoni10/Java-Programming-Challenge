// Inverted rotated half pyramid with numbers.

import java.util.*;

public class Rotated_Half_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of pattern in terms of rows : ");
        int n = sc.nextInt();

        print(n);
    }

    public static void print(int n) {
        for(int line = 0; line < n; line++) {
            for(int num = 1; num <= n-line; num++) {
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}

// Output -
// Enter the size of pattern in terms of rows : 6
// 1 2 3 4 5 6
// 1 2 3 4 5
// 1 2 3 4
// 1 2 3         
// 1 2
// 1     

