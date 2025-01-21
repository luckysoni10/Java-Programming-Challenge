import java.util.*;

public class Zero_One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of pattern in terms of rows : ");
        int n = sc.nextInt();

        print(n);
    }

    public static void print(int n) {
        int num = 0;
        for(int row = 0; row < n; row++) {
            for(int col = 0; col < row+1; col++ ) {
                if((row+col) % 2 == 0) {
                    System.out.print(" 1");
                } else {
                    System.out.print(" 0");
                }
            }
            System.out.println();
        }
    }
}

// Output-
// Enter the size of pattern in terms of rows : 5
//  1
//  0 1
//  1 0 1
//  0 1 0 1
//  1 0 1 0 1


