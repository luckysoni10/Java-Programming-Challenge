import java.util.*;
public class Hollow_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the width of rectangle : ");
        int totalRows = sc.nextInt();

        System.out.print("Enter the height of rectangle : ");
        int totalCols = sc.nextInt();

        hollowRectangle(totalRows,totalCols);
    }

    public static void hollowRectangle(int totalRows, int totalCols) {
        for(int line = 1; line<=totalRows; line++) {
            for(int cols = 1; cols <= totalCols; cols++) {
                if( line ==1 || line == totalRows || cols == 1 || cols == totalCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}

// Output-
// Enter the width of rectangle : 5
// Enter the height of rectangle : 10
// **********
// *        *
// *        *
// *        *
// **********
