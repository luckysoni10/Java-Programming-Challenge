public class Diagonal_Sum {
    public static void main(String[] args) {
        int matrix[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16},
        };
        System.out.print("Diagonal Sum of matrix is : "+printDiagonalSum(matrix));
    }

    public static int printDiagonalSum (int matrix[][]) {
        int sum = 0;
        //Brute force approach //O(n^2)
        // for(int i=0; i<matrix.length; i++) {
        //     for(int j=0; j<matrix[0].length; j++) {
        //         if(i == j) {
        //             sum += matrix[i][j];
        //         } else if ( i+j == matrix.length-1) {
        //             sum += matrix[i][j];
        //         }
        //     }
        // }

        //optimized approach //linear time comp.
        for(int i=0; i<matrix.length; i++) {
            //primary diagonal
            sum += matrix[i][i];

            //secondary diagonal
            if( i != matrix.length-i-1) 
                sum += matrix[i][matrix.length-i-1];
        }
        return sum;
    }
}

// Output-
// Diagonal Sum of matrix is : 68