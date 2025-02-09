// Print the number of 7's that are in the 2nd array.
// Ex. input int[][] array = { {4,7,8}, {8,8,7} } | Output- 2
import java.util.*;
public class Question1 {
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
                System.out.println();
            }
        }

        printMatrix(matrix);
        System.out.print("Enter the key to be searched : ");
        int key = sc.nextInt();

        System.out.println("The count of "+key+" is : "+keyCount(matrix, key));
    }
    public static int keyCount (int[][] matrix, int key) {
        int n = matrix.length, m = matrix[0].length, count = 0;
        for(int i=0; i<n; i++ ) {
            for(int j=0; j<m; j++) {
                if(matrix[i][j] == key) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void printMatrix(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        System.out.println("Our ["+n+"]"+"["+m+"] matrix is :- ");
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}

// Output-
// Enter the size of array :-
// Rows = 3
// Cols = 3
// Enter the elements into [3][3] matrix :- 
// Enter element in [0][0] position = 4

// Enter element in [0][1] position = 7

// Enter element in [0][2] position = 6

// Enter element in [1][0] position = 7

// Enter element in [1][1] position = 2

// Enter element in [1][2] position = 4

// Enter element in [2][0] position = 3

// Enter element in [2][1] position = 9

// Enter element in [2][2] position = 8

// Our [3][3] matrix is :-
// 4 7 6 
// 7 2 4
// 3 9 8 
// Enter the key to be searched : 7
// The count of 7 is : 2