import java.util.*;
public class Sum_1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. : ");
        int range = sc.nextInt();
        int counter = 1;
        int sum = 0;
        while(counter <= range) {
            sum += counter;
            counter++;
        }
        System.out.println("Sum of 1 to "+range+" is : "+sum);
    }
}

// Output-
// Enter a no. : 10
// Sum of 1 to 10 is : 55