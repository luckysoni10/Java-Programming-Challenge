import java.util.Scanner;

public class Binary_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt(); 

        int arr[] = new int[size]; 

        System.out.println("Enter the elements into array: ");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    
        System.out.print("Enter the key to be search: ");
        int key = sc.nextInt();

        int index = binarySearch(arr,key);

        if(index == -1) {
            System.out.println("Dat not found..");
        } else {
            System.out.println("Data found at index no. "+index);
        }

    }

    public static int binarySearch(int arr[], int key) {
        int start = 0; 
        int end = (arr.length - 1);
        int mid = (start + end) / 2;
        while( start <= end) {
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                end = mid -1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
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
// Enter the key to be search: 6 
// Data found at index no. 2
