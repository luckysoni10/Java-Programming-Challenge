import java.util.*;
public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of pattern in terms of rows : ");
        int n = sc.nextInt();


        print(n);
    }

    public static void print(int n) {
        for(int line = 1; line<= n; line++) {
            for(int space = 1; space <= n-line; space++) {
                System.out.print(" ");
            }

            for(int star = 1; star <= line; star++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    
}

// Output-
// Enter the size of pattern in terms of rows : 5
//      *
//     * *
//    * * *
//   * * * *
//  * * * * *