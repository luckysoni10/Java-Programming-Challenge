//Binomial Coefficient = n! / r!(n-r)!
import java.util.*;
 
class Binomial_Coefficient {
    public static int factorial(int number) {
        int fact = 1;
        for(int i = number; i > 0; i--) {
            fact = i * fact;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();

        System.out.print("Enter r : ");
        int r = sc.nextInt();

        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n-r);

        int binomialCoefficient = n_fact / (r_fact * nmr_fact);

        System.out.println("binomial Coefficient is : "+binomialCoefficient);
        
    }
}
Output-
Enter n : 5
Enter r : 2
binomial Coefficient is : 10