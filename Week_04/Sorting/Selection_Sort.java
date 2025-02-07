import java.util.*;
public class Selection_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the "+n+" elements into array : ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Sorted array by bubble sort is : ");
        selectionSort(arr);
        printArr(arr);
    }
    public static void selectionSort (int arr[]) {
        for(int i=0; i<arr.length-1; i++) {
            int minPos = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
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
// 6
// 4
// 1
// 7 
// 5
// Sorted array by bubble sort is :
// 1  4  5  6  7  
