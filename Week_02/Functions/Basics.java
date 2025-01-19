import java.util.*;

class Basics {
    
    public static int calculateSum ( int a , int b ) {
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first no. : ");
        int n1 = sc.nextInt();

        System.out.print("Enter second no. : ");
        int n2 = sc.nextInt();

        int sum = calculateSum(n1,n2);

        System.out.println("sum is : "+sum);

    }
}

// output-
// Enter first no. : 10
// Enter second no. : 23
// sum is : 33