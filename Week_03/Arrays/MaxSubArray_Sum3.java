// Max Subarray Sum (Kaden's Algorithm)
import java.util.*;
public class MaxSubArray_Sum3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt(); 

        int arr[] = new int[size]; 

        System.out.println("Enter the elements into array: ");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Max Sub Array Sum is : "+maxSubarraySum(arr));
    }

    public static int maxSubarraySum(int arr[]) {
        int maxSum = Integer.MIN_VALUE, currentSum = 0;
        for(int i=0; i<arr.length; i++) {
            currentSum = currentSum + arr[i];
            if(currentSum < 0) {
                currentSum = 0;
            }
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }
}

// Output-
// Enter the size of array: 8
// Enter the elements into array:
// -2
// -3
// 4
// -1
// -2
// 1
// 5
// -3
// Max Sub Array Sum is : 7



