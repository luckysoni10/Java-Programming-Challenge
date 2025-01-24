import java.util.*;
public class Basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Creating array:

        
        int numbers[] = {1,2,3,4,5}; //it will automatically detect the size
        
        String names[] = {"lucky","soni"};

        int marks [] = new int[50]; //empty array and it will store zero(0) until we assign the values.
        System.out.print("Enter first value: ");
        marks[0] = sc.nextInt();

        System.out.print("Enter second value: ");
        marks[1] = sc.nextInt();

        System.out.print("Enter third value: ");
        marks[2] = sc.nextInt();

        marks[2] = 10; // updating the value

        int avg = marks[0] + marks[1] + marks[2] ;

        System.out.println("Avg marks: "+avg);
    }
}
//Output-
// Enter first value: 10
// Enter second value: 50
// Enter third value: 55     
// Avg marks: 115