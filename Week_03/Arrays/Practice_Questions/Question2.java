/* 33. There is an integer array nums sorted ascending order (with distinct values).
Prior to being passed to your function, nums is possibly rotate at an unknown pivot index k(1<=k < nums.length) such that the resulting array is [nums[k] , nums[k+1], ....., nums[n-1], nums[0], nums[1], ....., nums[k-1] ] (o-indexed).
For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums. 
You must write an algorithm with O(log n) runtime complexity.
 */
import java.util.*;
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the sorted and rotated array of size "+n+" : ");
        for(int i=0;  i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target integer : ");
        int target = sc.nextInt();
        returnIndex(arr,target);
    }

    public static int returnIndex (int[] arr, int target) {
        int mid, low = 0, high = arr.length;

        while(low <= high) {
            mid = (low + high) / 2;

            if(arr[mid] == target) {
                return mid;
            } else if (arr[low] <= arr[mid]) {
                if( target >= arr[low]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if(target >= arr[mid+1] && target <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
    }
}
