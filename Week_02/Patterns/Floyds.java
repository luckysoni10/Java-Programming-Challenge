import java.util.*;

public class Floyds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of pattern in terms of rows : ");
        int n = sc.nextInt();

        print(n);
    }

    public static void print(int n) {
        int num = 1;
        for(int line = 0; line < n; line++) {
            for(int p = 0; p < line+1; p++ ) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}

// Output-
// Enter the size of pattern in terms of rows : 5
// 1 
// 2 3
// 4 5 6
// 7 8 9 10 
// 11 12 13 14 15


