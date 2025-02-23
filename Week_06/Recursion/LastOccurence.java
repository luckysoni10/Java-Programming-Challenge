//WAP to find the last occurence of an element in an array.
public class LastOccurence {
    public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        int ans = lastOccur(arr, 5, 0);
        if(ans == -1) {
            System.out.println("not found.");
        } else {
            System.out.println("found at "+ans);
        }
    }
    public static int lastOccur(int arr[], int key, int i) {
        if(i == arr.length) {
            return -1;
        }
        int isFound = lastOccur(arr, key, i+1);
        if(isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }
}
// Ouptut-
// found at 7
