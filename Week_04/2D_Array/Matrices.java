import java.util.*;
public class Matrices {
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
        searchKey(matrix, key);
    }
    public static boolean searchKey(int[][] matrix, int key) {
        int n = matrix.length, m = matrix[0].length;
        for(int i=0; i<n; i++ ) {
            for(int j=0; j<m; j++) {
                if(matrix[i][j] == key) {
                    System.out.println(key+" found at cell ["+i+"]"+"["+j+"]");
                    return true;
                }
            }
        }
        System.out.println(key+" not found in matrix..!!");
        return false;
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
// Enter the size array :-
// Rows = 3
// Cols = 3
// Enter the elements into [3][3] matrix :- 
// Enter element in [0][0] position = 1

// Enter element in [0][1] position = 2

// Enter element in [0][2] position = 3

// Enter element in [1][0] position = 4

// Enter element in [1][1] position = 5

// Enter element in [1][2] position = 6

// Enter element in [2][0] position = 7

// Enter element in [2][1] position = 8

// Enter element in [2][2] position = 9

// Our [3][3] matrix is :- 
// 1 2 3 
// 4 5 6 
// 7 8 9
// Enter the key to be searched : 6
// 6 found at cell [1][2]