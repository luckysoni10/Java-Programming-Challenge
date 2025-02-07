import java.util.*;
public class Bubble_Sort {
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
        bubbleSort(arr);
        printArr(arr);
    }
    public static void bubbleSort (int arr[]) {
        for(int i=0; i<arr.length-1; i++) {
            for(int j=0; j<arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
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
// Enter the size of array : 5
// Enter the 5 elements into array : 
// 5
// 4
// 9
// 7
// 2
// Sorted array by bubble sort is : 
// 2  4  5  7  9