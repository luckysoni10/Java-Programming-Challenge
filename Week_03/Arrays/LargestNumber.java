import java.util.*;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt(); 

        int arr[] = new int[size];

        System.out.println("Enter the elements into array: ");
        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Largest value in array is : "+checkLargest(arr));
    }

    public static int checkLargest (int arr[]) {
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
}

// Output-
// Enter the size of array: 5
// Enter the elements into array:
// 7
// 4
// 9
// 3
// 1
// Largest value in array is : 9
