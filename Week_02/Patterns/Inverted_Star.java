import java.util.*;

class Inverted_Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. : ");
        int n = sc.nextInt();

        for(int line = 1; line <=n; line++) {
            for(int star = 1; star<=(n - line + 1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// Output-
// Enter a no. : 5
// *****
// ****
// ***
// **
// *