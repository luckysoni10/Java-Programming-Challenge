import java.util.*;

public class Solid_Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of pattern in terms of rows : ");
        int n = sc.nextInt();

        print(n);
    }

    public static void print(int n) {
        int num = 0;
        for(int row = 0; row < n; row++) {
            for(int space = 1; space < n-row; space++) {
                System.out.print("  ");
            }
            for(int star = 1; star <= n; star++ ) { 
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}

// Output-
// Enter the size of pattern in terms of rows : 5
//          * * * * *
//        * * * * *
//      * * * * *
//    * * * * *
//  * * * * *


