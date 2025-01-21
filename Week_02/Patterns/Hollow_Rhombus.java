import java.util.*;

public class Hollow_Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of pattern in terms of rows : ");
        int n = sc.nextInt();

        print(n);
    }

    public static void print(int n) {
        for(int row = 1; row <= n; row++) {

            for(int space = 1; space <= n-row; space++) {
                System.out.print("  ");
            }

            for(int cols = 1; cols <= n; cols++) {
                if( row ==1 || row == n || cols == 1 || cols == n) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}

// Output-
// Enter the size of pattern in terms of rows : 5
//          * * * * *
//        *       *
//      *       *
//    *       *
//  * * * * *

