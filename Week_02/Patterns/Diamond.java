import java.util.*;

public class Diamond {
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
            for(int star = 1; star <= (2*row)-1; star++ ) { 
                System.out.print(" *");
            }
            System.out.println();
        }

        for(int row = n-1; row >= 1; row--) {
            for(int space = 1; space <= n-row; space++) {
                System.out.print("  ");
            }
            for(int star = 1; star <= 2*row-1; star++ ) { 
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}

// Output-
// Enter the size of pattern in terms of rows : 5
//          *
//        * * *
//      * * * * *
//    * * * * * * *
//  * * * * * * * * *
//    * * * * * * *
//      * * * * *
//        * * *
//          *

