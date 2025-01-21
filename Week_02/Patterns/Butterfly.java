import java.util.*;

public class Butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of pattern in terms of rows : ");
        int n = sc.nextInt();

        print(n);
    }

    public static void print(int n) {

        for(int row = 1; row <= n; row++) {
           for(int col = 1; col <= row; col++) {
            System.out.print(" *");
           }
           for( int space = 1; space <= (2*(n-row)); space++) {
            System.out.print("  ");
           }
           for(int col = 1; col <= row; col++) {
            System.out.print(" *");
           }
            System.out.println();
        }


        for(int row = n; row >= 0; row--) {
            for(int col = 1; col <= row; col++) {
             System.out.print(" *");
            }
            for( int space = 1; space <= (2*(n-row)); space++) {
             System.out.print("  ");
            }
            for(int col = 1; col <= row; col++) {
             System.out.print(" *");
            }
             System.out.println();
         }
    }
}

// Output-

// Enter the size of pattern in terms of rows : 5
//  *                 *
//  * *             * *
//  * * *         * * *
//  * * * *     * * * *
//  * * * * * * * * * *
//  * * * * * * * * * *
//  * * * *     * * * *
//  * * *         * * *
//  * *             * *
//  *                 *



