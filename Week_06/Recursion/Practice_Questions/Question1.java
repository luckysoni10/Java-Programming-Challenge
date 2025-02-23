//Question1. 
//for a given integer array of size N. 
//you have to find all the occurrences (indices) of a given element (key) and print them.
//use a recursive function to solve this problem.

public class Question1 {
    public static void main(String[] args) {
        int arr[] = {3,2,4,5,6,2,7,2,2};
        int key = 2;
        printAllOccur(arr, key, 0);
    }
    public static void printAllOccur(int[] arr, int key, int i) {
        if(i == arr.length) {
            return;
        }
        if(arr[i] == key) {
            System.out.print(i+" ");
        }
        printAllOccur(arr, key, i+1); 
    }
}
//Output-
//1 5 7 8