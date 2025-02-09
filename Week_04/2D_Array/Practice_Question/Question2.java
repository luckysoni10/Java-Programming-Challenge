// Print out the sumof the numbers in the second row of the "nums" array.
// Ex. int[][] nums = { {1,4,9}, {11,4,3}, {2,2,3} } | Output - 18

import java.util.*;
public class Question2 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array :-");
        System.out.print("Rows = ");
        int n = sc.nextInt();
        System.out.print("Cols = ");
        int m = sc.nextInt();

        int matrix[][] = new int[n][m];

        System.out.println("Enter the elements into ["+n+"]"+"["+m+"] matrix :- ");
        for(int i=0; i<n; i++ ) {
            for(int j=0; j<m; j++) {
                System.out.print("Enter element in ["+i+"]"+"["+j+"] position = ");
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Sum of the numbers in the second row is : "+secondRowSum(matrix));
    }
    public static int secondRowSum (int[][] matrix) {
        int sum = 0;
        for(int j=0; j<matrix[0].length; j++) {
            sum += matrix[1][j];
        }
        return sum;
    }
}

// Output-
// Enter the size of array :-
// Rows = 3
// Cols = 3
// Enter the elements into [3][3] matrix :- 
// Enter element in [0][0] position = 1
// Enter element in [0][1] position = 4
// Enter element in [0][2] position = 9
// Enter element in [1][0] position = 11
// Enter element in [1][1] position = 4
// Enter element in [1][2] position = 3
// Enter element in [2][0] position = 2
// Enter element in [2][1] position = 2
// Enter element in [2][2] position = 3
// Sum of the numbers in the second row is : 18