import java.util.*;

public class TernaryOperator {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. to check wheather it is even or odd : ");
        int number = sc.nextInt();

        String type = ((number % 2)==0) ? "Even" : "Odd";
        System.out.println(number + " is " +type);
     }  
}

// output - 

// Enter the no. to check wheather it is even or odd : 5
// 5 is Odd

// Enter the no. to check wheather it is even or odd : 2
// 2 is Even