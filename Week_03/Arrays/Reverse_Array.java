import java.util.Scanner;
public class Reverse_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt(); 

        int arr[] = new int[size]; 

        System.out.println("Enter the elements into array: ");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        reverseArray(arr);

        System.out.println("Sorted Array :-");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }
    }

    public static int[] reverseArray(int arr[]) {
        int start = 0, end = arr.length -1 ;
        while(start != end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}

// Output-
// Enter the size of array: 5
// Enter the elements into array:
// 1
// 2 
// 3
// 4
// 5
// Sorted Array :-
// 5  4  3  2  1  