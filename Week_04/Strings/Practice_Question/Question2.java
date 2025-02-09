//Question- Determine if 2 strings are anagrams of each other.
/*What are anagrams?
 * If two strings contain the same characters but in a different order, they can be said to be anagrams. 
 * Consider race and care. In this case, race's characters can be formed into a study,
 * or care's characters can be formed into race. 
 * Below is a java program to check if tow strings are anagrams or not.
 */
import java.util.*;
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string : ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string : ");
        String str2 = sc.nextLine();

        if(isAnagrams(str1, str2)) {
            System.out.println(str1+" and "+str2+" are anagrams of each other..");
        } else {
            System.out.println(str1+" and "+str2+" are not anagrams of each other..!!");
        }
    }
    public static boolean isAnagrams(String str1, String str2) {
        //convert strings to lowercase.
        String s1 = str1.toLowerCase();
        String s2 = str2.toLowerCase();

        //first check - if the lengths are the same
        if(s1.length() == s2.length()) {
            //convert strings into char array.
            char[] str1CharArr = s1.toCharArray();
            char[] str2CharArr = s1.toCharArray();
            //sort the char array
            Arrays.sort(str1CharArr);
            Arrays.sort(str2CharArr);
            //if the sorted char arrays are same or identical then the strings are anagrams.
            boolean anagrams = Arrays.equals(str1CharArr, str2CharArr);
            if(anagrams) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}

// Output-
// Enter first string : earth
// Enter second string : heart
// earth and heart are anagrams of each other..