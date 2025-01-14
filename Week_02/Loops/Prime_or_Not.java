import java.util.*;
public class Prime_or_Not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        if( n == 2) {
            System.out.println(n+" is a prime number");
        } else {
            boolean isPrime = true;

            for(int i = 2; i <= Math.sqrt(n); i++ ) {
                if ( n % i == 0 ) {
                    isPrime = false;
                }
            }

            if(isPrime == true) {
                System.out.println(n+" is a prime number");
            } else {
                System.out.println(n+" is not a prime number");
            }
        }
    }
}

// Output- 
// Enter a number : 5
// 5 is a prime number

// Enter a number : 100
// 100 is not a prime number
