//Question- String Compression.
//Ex. "aaabbcccddd" | O/P- "a3b2c3d2"

import java.util.*;
public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();
        System.out.println("Compressed String : "+compress(str));
    }
    public static String compress(String str) {
        String compressedStr = new String("");
        for(int i=0; i<str.length(); i++) {
            Integer count = 1;
            while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }
            compressedStr += str.charAt(i);
            if(count > 1) {
                compressedStr += count.toString();
            }

        }
        return compressedStr; 
    }
}

// Output-
// Enter the string : aaabbcccddd
// Compressed String : a3b2c3d3