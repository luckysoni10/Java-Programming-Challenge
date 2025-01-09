import java.util.*;

public class LargestOfTwoNo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first no. : ");
        int var1 = sc.nextInt();

        System.out.println("Enter second no. : ");
        int var2 = sc.nextInt();

        if(var1 > var2) {
            System.out.println(var1 + " is larger.");
        }else {
            System.out.println(var2+" is larger.");
        }
    }
}

// Output - 
// Enter first no. : 2
// Enter second no. : 5
// 5 is larger.