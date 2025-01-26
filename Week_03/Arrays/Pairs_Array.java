import java.util.*;
public class Pairs_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt(); 

        int arr[] = new int[size]; 

        System.out.println("Enter the elements into array: ");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        printPairs(arr);
    }

    public static void printPairs(int arr[]) {
        System.out.println("Pairs:-");
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                System.out.print("("+arr[i]+","+arr[j]+") ");
            }
            System.out.println();
        }
    }
}

// Output-
// Enter the size of array: 5
// Enter the elements into array:
// 2
// 4
// 6
// 8
// 10
// Pairs:-
// (2,4) (2,6) (2,8) (2,10) 
// (4,6) (4,8) (4,10)
// (6,8) (6,10)
// (8,10)
