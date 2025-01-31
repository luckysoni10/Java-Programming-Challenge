// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
import java.util.*;
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt(); 

        int nums[] = new int[size]; 

        System.out.println("Enter the elements into array: ");
        for(int i=0; i<nums.length; i++) {
            nums[i] = sc.nextInt();
        }  

        if(check(nums)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static boolean check(int nums[]) {
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if( i == nums.length) {
                    return false;
                } else if(nums[i] == nums[j]) {
                    return true;
                } 
            }
        }
        return false;
    }
}

// Output-
// Enter the size? of array: 5
// Enter the elements into array:
// 4
// 3
// 1 
// 3
// 7
// true