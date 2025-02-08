import java.util.*;

public class Spiral_Matrix {
    public static void main(String[] args) {
        int matrix[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16},
        };
        System.out.println("Matrix elements in spiral manner :-");
        printSpiral(matrix);
    }

    public static void printSpiral (int matrix[][]) {
        int startRow = 0, startCol = 0, endRow = matrix.length-1, endCol = matrix[0].length-1;
        while(startRow <= endRow && startCol <= endCol) {
            //top boundary
            for(int j=startCol; j<=endCol; j++ ) {
                System.out.print(matrix[startRow][j]+" ");
            }

            //right boundary
            for(int i=startRow+1; i<=endRow; i++) {
                System.out.print(matrix[i][endCol]+" ");
            }

            //bottom boundary
            for(int j=endCol-1; j>=startCol; j--) {
                if(startCol == endCol) {
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }

            //left boundary
            for(int i=endRow-1; i>=startRow+1; i--) {
                if(startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }
}

// Output-
// Matrix elements in spiral manner :-
// 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 