import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string to check if it is palindrome or not : ");
        String str = sc.nextLine();
        if(isPalindrome(str)) {
            System.out.println(str+" is a palindrome string..");
        } else {
            System.out.println(str+" is not a palindrome string..!!");
        }
    }
    public static boolean isPalindrome(String str) {
        int strLength = str.length();
        for(int i=0; i<strLength/2; i++) {
            if(str.charAt(i) != str.charAt(strLength-1-i)) {
                return false;
            }
        }
        return true;
    }
}

// Output-
// Enter any string to check if it is palindrome or not : noon
// noon is a palindrome string..