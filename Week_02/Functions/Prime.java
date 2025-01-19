import java.util.*;

public class Prime {

    public static boolean isPrime (int number) {
        if(number == 2) {
            return true;
        } else {
            for(int i = 2; i< Math.sqrt(number-1); i++) {
                if (number % i == 0 ) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a no. : ");
        int number = sc.nextInt();

        if(isPrime(number)) {
            System.out.println("Given no. is a prime number..");
        } else {
            System.out.println("Given no. is not a prime number..");
        }
    }
}

// Output- 
// Enter a no. : 3
// Given no. is a prime number..