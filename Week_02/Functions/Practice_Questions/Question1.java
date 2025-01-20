// Write a java methodltw1 to compute the average of three numbers.
import java.util.*;

public class Question1 {

    public static double average (double a, double b, double c ) {
        return (a+b+c)/3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first no. : ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second no. : ");
        double num2 = sc.nextDouble();

        System.out.print("Enter third no. : ");
        double num3 = sc.nextDouble();

        System.out.println("Average is : "+average(num1, num2, num3));
    }
}

// Output- 
// Enter first no. : 5
// Enter second no. : 2
// Enter third no. : 10
// Average is : 5.666666666666667