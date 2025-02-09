import java.util.*;

public class StringFunctions {
    public static void main(String[] args) {
        String str1 = "lucky";
        String str2 = "lucky";
        String str3 = new String("lucky");
    
        if(str1 == str2) {
            System.out.println("Strings are equal..");
        } else {
            System.out.println("Strings are not equal..!!");
        } //Output- Strings are equal..
    
        // if(str1 == str3) {
        //     System.out.println("Strings are equal..");
        // } else {
        //     System.out.println("Strings are not equal..!!");
        // } //Output- Strings are not equal..!!

        if(str1.equals(str3)) {
            System.out.println("Strings are equal..");
        } else {
            System.out.println("Strings are not equal..!!");
        } //Output-Strings are equal..



        //substring
        String name = "HelloWorld";
        System.out.println(subString(name,0,5));
        //Output- Hello

        //inbuilt function for substring:
        System.out.println(name.substring(0,5)); 
        //Output- Hello
    }
    public static String subString(String name, int startingIndex, int endingIndex) {
        String subString = "";
        for(int i=startingIndex; i<endingIndex; i++) {
            subString += name.charAt(i);
        }
        return subString;
    }
}
