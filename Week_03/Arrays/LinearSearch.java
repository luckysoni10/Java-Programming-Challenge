import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int [5];  

        System.out.println("Enter the elements into array: ");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    
        System.out.print("Enter the key to be search: ");
        int key = sc.nextInt();

        int index = linearSearch(arr,key);

        if(index == -1) {
            System.out.println("Dat not found..");
        } else {
            System.out.println("Data found at index no. "+index);
        }

    }

    public static int linearSearch(int arr[], int key) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == key) {
                return i;
            } 
        }
        return -1;
    }
}

// Output-
// Enter the elements into array:
// 5 
// 4
// 7
// 9
// 3
// Enter the key to be search: 9
// Data found at index no. 3