//Question 3
//WAP to find length of a string using recursion.

public class Question3 {
    public static void main(String[] args) {
        String str = "abcde";
        System.out.println(length(str));
    }
    public static int length(String str) {
        if(str.length() == 0) {
            return 0;
        }

        return length(str.substring(1))+1;
    }
}
//Output-
//5