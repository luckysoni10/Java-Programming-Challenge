import java.util.*;

public class PrimesInRange {

    public static void printPrimes (int range) {
        for(int i=2; i<=range; i++) { 
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static boolean isPrime (int number) {
        if(number == 2) {
            return true;
        } else {
            for(int i = 2; i<= Math.sqrt(number); i++) {
                if (number % i == 0 ) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a range : ");
        int range = sc.nextInt();

        printPrimes(range);
    }
}

// Output - 
// Enter a range : 20
// 2 3 5 7 11 13 17 19 