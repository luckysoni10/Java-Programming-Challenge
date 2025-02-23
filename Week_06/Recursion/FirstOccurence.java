//WAP to find the first occurence of an element in an array.
public class FirstOccurence {
    public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        int ans = firstOccur(arr, 5, 0);
        if(ans == -1) {
            System.out.println("not found.");
        } else {
            System.out.println("found at "+ans);
        }
    }
    public static int firstOccur(int arr[], int key, int i) {
        if(i == arr.length) {
            return -1;
        }
        if(arr[i] == key) {
            return i;
        }
        return firstOccur(arr,key,i+1) ;
    }
}
// Output-
// found at 4