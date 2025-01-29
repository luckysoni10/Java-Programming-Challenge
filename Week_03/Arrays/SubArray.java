import java.util.*;
public class SubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt(); 

        int arr[] = new int[size]; 

        System.out.println("Enter the elements into array: ");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        printSubarray(arr);
    }

    public static void printSubarray(int arr[]) {
        int totalSubArray = 0;
        System.out.println("Sub Arrays:-");
        for(int i=0; i<arr.length; i++) {
            for(int j=i; j<arr.length; j++) {
                for(int k=i; k<=j; k++) {
                    System.out.print(arr[k]+" ");
                }
                totalSubArray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Sub Array = "+totalSubArray);
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
// Sub Arrays:-
// 2 
// 2 4
// 2 4 6
// 2 4 6 8
// 2 4 6 8 10

// 4
// 4 6
// 4 6 8
// 4 6 8 10 

// 6
// 6 8
// 6 8 10 

// 8
// 8 10

// 10

// Total Sub Array = 15