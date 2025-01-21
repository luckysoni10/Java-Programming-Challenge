import java.util.*;

public class DecimalToBinary {

    public static int DtoB (int decimalNumber) {
        int binaryNumber=0,power=0;
        while(decimalNumber > 0 ) {
            int remender = decimalNumber % 2;
            binaryNumber = binaryNumber + (remender * (int)Math.pow(10,power));
            power++;
            decimalNumber = decimalNumber / 2;
        }
        return binaryNumber;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal no. : ");
        int decimalNumber = sc.nextInt();

        System.out.println("Binary number is : "+DtoB(decimalNumber));
        
    }
}

// Output-
// Enter a decimal no. : 10
// Binary number is : 1010