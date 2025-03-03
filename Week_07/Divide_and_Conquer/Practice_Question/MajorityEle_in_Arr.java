//Given an array of nums of size n, return the majority element.
//the majority element is the element that appears more than n/2 times. you may assume that the majority element always exists in the array.
//i/p: nums = [3,2,3]  |  o/p: 3

//Brute Force Approach - O(n^2)
/*
public class MajorityEle_in_Arr {
    public static void main(String[] args) {
        int nums[] = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int nums[]) {
        int majorityCount = nums.length/2;
        for(int i=0; i<nums.length; i++) {
            int count = 0; 
            for(int j=0; j<nums.length; j++) {
                if(nums[j] == nums[i]) {
                    count += 1;
                }
            }
            if(count > majorityCount) {
                return nums[i];
            }
        }
        return -1;
    }
} */
// Output- 2



//Divide & Conquer Approach - O(n*logn)
public class MajorityEle_in_Arr {
    public static void main(String[] args) {
        int nums[] = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }

    private static int countInRange(int[] nums, int num, int lo, int hi) {
        int count = 0;
        for(int i=lo; i<=hi; i++ ){
            if(nums[i] == num) {
                count++;
            }
        }
        return count;
    }

    private static int majorityElementRec(int[] nums, int lo, int hi) {
        //base case:
        //the only element in an array of size 1 is the majority element.
        if(lo == hi) {
            return nums[lo];
        }

        //recurse on left and right halves of this slice.
        int mid = (hi-lo)/2 + lo;
        int left = majorityElementRec(nums, lo, mid) ;
        int right = majorityElementRec(nums, mid+1, hi);

        //if the two halves agree on the majority element, return it.
        if(left == right) {
            return left;
        }

        //otherwise, count each element and return the "winner".
        int leftCount = countInRange(nums, left, lo, hi);
        int rightCount = countInRange(nums, right, lo, hi);

        return leftCount > rightCount ? left : right;
    }
    
    public static int majorityElement(int[] nums) {
        return majorityElementRec(nums, 0, nums.length-1);
    }
}
//Output- 2