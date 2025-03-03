//Question 1: apply merge sort to short any array of strings.( assume that all the characters in all the strings are in lowercase).
//i/p: arr= {"sum","earth","mars","mercury"}
//o/p: arr= {"earth","mars","mercury","sum"}

public class MergeSort_StringArr {
    public static void main(String[] args) {
        String arr[] = {"sun", "earth", "mars", "mercury"};
        String ans[] = mergeSort(arr,0,arr.length-1);
        for(int i=0; i<ans.length; i++) {
            System.out.println(ans[i]);
        }
    }

    public static String[] mergeSort(String arr[], int low, int high) {
        if(low == high) {
            String[] A = {arr[low]};
            return A;
        }

        int mid = low + (high - low) /2;
        String[] arr1 = mergeSort(arr, low, mid);
        String[] arr2 = mergeSort(arr, mid+1, high) ;

        String[] arr3 = merge(arr1, arr2);
        return arr3;
    }

    public static String[] merge(String[] arr1, String[] arr2){
        int m = arr1.length;
        int n = arr2.length;
        String[] arr3 = new String[m+n];

        int idx = 0;

        int i = 0, j = 0;

        while(i < m && j < n) {
            if(isAlphabeticallySmaller(arr1[i], arr2[i])) {
                arr3[idx] = arr1[i];
                i++;
                idx++;
            } else {
                arr3[idx] = arr2[j];
                j++;
                idx++;
            }
        }
        while(i < m) {
            arr3[idx] = arr1[i];
            i++;
            idx++;
        }
        while(j < n) {
            arr3[idx] = arr2[j];
            j++;
            idx++;
        }
        return arr3;
    }

    //return true if str1 appears before str2 in alphabetical order
    static boolean isAlphabeticallySmaller(String str1, String str2) {
        if(str1.compareTo(str2) < 0 ) {
            return true;
        }
        return false;
    }
}

//Output-
// earth
// mars
// mercury
// sun