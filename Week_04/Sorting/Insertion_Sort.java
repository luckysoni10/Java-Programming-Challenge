import java.util.*;
public class Insertion_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the "+n+" elements into array : ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Sorted array by insertion sort is : ");
        insertionSort(arr);
        printArr(arr);
    }
    public static void insertionSort (int arr[]) {
        for(int i=1; i<arr.length; i++) {
            int curr=arr[i], prev=i-1;
            //finding out the correct pos to insert
            while(prev >= 0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = curr;
        }
    }
    public static void printArr (int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+"  ");
        } 
    }
}

// Output-
// Enter the size of array : 5
// Enter the 5 elements into array : 
// 7
// 6
// 2
// 7
// 1
// Sorted array by insertion sort is :
// 1  2  6  7  7
