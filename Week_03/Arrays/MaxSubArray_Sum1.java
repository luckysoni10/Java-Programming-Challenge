// Max Subarray Sum (Brute Force)
import java.util.*;
public class MaxSubArray_Sum1 {
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
            for(int j=i; j<arr.length; j++) {
                for(int k=i; k<=j; k++) {
                    currentSum += arr[k];
                }
                if(currentSum > maxSum) {
                    maxSum = currentSum;
                }
                currentSum = 0;
            }
        }
        return maxSum;
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
// Max Sub Array Sum is : 30
