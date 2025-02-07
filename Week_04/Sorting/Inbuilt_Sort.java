import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Inbuilt_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        Integer arr[] = new Integer[n];
        System.out.println("Enter the " + n + " elements into array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Sorted array by Inbuilt sort in ascending order : ");
        Arrays.sort(arr); // O(n logn)
        printArr(arr);

        System.out.println("Sorted array in ascending order from index 0 to 2 : ");
        Arrays.sort(arr, 0, 3); // Arrays.sort(arr, starting_index, ending_index);
        printArr(arr);

        System.out.println("Sorted array by Inbuilt sort in descending order : ");
        Arrays.sort(arr, Collections.reverseOrder()); // It works on objects, so we will have to make int to Integer.
        printArr(arr);

        System.out.println("Sorted array in descending order from index 0 to 2 : ");
        Arrays.sort(arr, 0, 3, Collections.reverseOrder());
        printArr(arr);
    }

    public static void printArr(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }
}
