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
        System.out.println("Sub Arrays:-");
        for(int i=0; i<arr.length; i++) {
            for(int j=i; j<arr.length; j++) {
                for(int k=i; k<=j; k++) {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

// Output-
// Enter the size of array: 5
// Enter the elements into array:
// 1
// 2
// 3
// 4
// 5
// Sub Arrays:-
// 1 
// 1 2
// 1 2 3
// 1 2 3 4 
// 1 2 3 4 5

// 2
// 2 3 
// 2 3 4
// 2 3 4 5

// 3 
// 3 4
// 3 4 5

// 4
// 4 5

// 5
