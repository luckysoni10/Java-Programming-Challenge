//Question- Count how many times lowercase vowels occured in a String entered by the user.
import java.util.*;
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();
        System.out.println("Count : "+printCount(str));
    }
    public static int printCount(String str) {
        int count = 0;
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}

// Output-
// Enter the string : my name is lucky soni
// Count : 6