/* Write a program to find Transpose of a matrix.
    What is transpose?
    Transpose of a marix is the process of swappint the rows to columns. 
    For a 2 x 3 matrix,

    Matrix
    a11 a12 a13
    a21 a22 a23

    Transposed Matrix
    a11 a21
    a12 a22
    a13 a23
*/ 

import java.util.*;
public class Question3 {
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
        System.out.println("Original Matrix :- ");
        printMatrix(matrix);
        System.out.println("Transposed Matrix :- ");
        printMatrix(transposed(matrix));
    }
    
    public static int[][] transposed(int[][] matrix) {
        int[][] transposedMatrix = new int[matrix[0].length][matrix.length];
        for(int i=0; i<matrix[0].length; i++) {
            for(int j=0; j<matrix.length; j++) {
                transposedMatrix[i][j] = matrix[j][i];
            }
        }
        return transposedMatrix;
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
// Rows = 2
// Cols = 3
// Enter the elements into [2][3] matrix :- 
// Enter element in [0][0] position = 1
// Enter element in [0][1] position = 2
// Enter element in [0][2] position = 3
// Enter element in [1][0] position = 4
// Enter element in [1][1] position = 5
// Enter element in [1][2] position = 6
// Original Matrix :-
// Our [2][3] matrix is :-
// 1 2 3 
// 4 5 6
// Transposed Matrix :-
// Our [3][2] matrix is :-
// 1 4 
// 2 5
// 3 6 
