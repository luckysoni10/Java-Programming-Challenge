import java.util.*;

public class BinaryToDecimal {

    public static int power (int number) {
        int power=1;
        for(int i = 0; i<number; i++) {
            power *= 2;   
        }
        return power;
    }
    public static int lastDigit (int number) {
        return number % 10;
    }

    public static int BtoD (int binaryNumber) {
        int decimalNumber=0,pow=0;
        while(binaryNumber > 0 ) {
            decimalNumber = decimalNumber + (lastDigit(binaryNumber) * power(pow));
            pow++;
            binaryNumber = binaryNumber / 10;            
        }
        return decimalNumber;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary no. : ");
        int binaryNumber = sc.nextInt();

        System.out.println("Decimal number is : "+BtoD(binaryNumber));
        
    }
}
// Output-
// Enter a binary no. : 10010
// Decimal number is : 18