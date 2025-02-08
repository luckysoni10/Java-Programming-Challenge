import java.util.*;
public class Counting_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the "+n+" elements into array : ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Sorted array by counting sort is : ");
        countingSort(arr);
        printArr(arr);
    }
    public static void countingSort (int arr[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++ ) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest+1];
        for(int i=0; i<arr.length; i++) {
            count[arr[i]]++;
        }

        //sorting
        int j=0; 
        for(int i=0; i<count.length; i++) {
            while(count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void printArr (int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+"  ");
        } 
    }
}

// Output-
// Enter the size of array : 8
// Enter the 8 elements into array : 
// 1
// 4
// 1
// 3
// 2
// 4
// 3
// 7
// Sorted array by counting sort is :
// 1  1  2  3  3  4  4  7  