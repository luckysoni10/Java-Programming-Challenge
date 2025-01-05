//Q. Enter cost of items from the user (using float data type) like pencil, pen, eraser. And give the total cost of the items with 18% GST tax to the items in the bill.

import java.util.*;

public class PracticeQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the cost of pencil : ");
        float pencilCost = sc.nextFloat();

        System.out.println("Enter the cost of pen : ");
        float penCost = sc.nextFloat();

        System.out.println("Enter the cost of eraser : ");
        float eraserCost = sc.nextFloat();

        float cost = pencilCost + penCost + eraserCost;
        float bill = cost + (cost * 18 / 100);

        System.out.println("Bil is : "+bill);
    }
}