// Max Subarray Sum (Prefix Sum)
import java.util.*;
public class MaxSubArray_Sum2 {
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
        int prerfixArr[] = new int[arr.length];
        // prefix[i-1] + arr[i]; // prefix array
        //eg. arr = 1, -2, 6, -1, 3
        //prefix arr = 1, -1, 5, 4, 7

        prerfixArr[0] = arr[0];
        //calculate prefix array
        for(int i=1; i<prerfixArr.length; i++) {
            prerfixArr[i] = prerfixArr[i-1] + arr[i]; 
        }
        for(int i=0; i<arr.length; i++) {
            for(int j=i; j<arr.length; j++) {
                currentSum = i == 0 ? prerfixArr[j] : prerfixArr[j] - prerfixArr[i-1];
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
// 1 
// -2
// 6
// -1
// 3
// Max Sub Array Sum is : 8


