//Question- For a given set of strings, print the largest string.
import java.util.*;

public class LargestString {
   public static void main(String[] args) {
    String fruits[] = {"apple", "mango", "banana"};

    String largest = fruits[0];
    for(int i=1; i<fruits.length; i++) {
        if(largest.compareTo(fruits[i]) < 0) {
            largest = fruits[i];
        }
    }
    System.out.println("Largest String is : "+largest);
   } 
}
// Output-
// Largest String is : mango