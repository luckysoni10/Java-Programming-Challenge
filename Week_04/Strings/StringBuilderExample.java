import java.util.*;
public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for(char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }
        System.out.println(sb);
    }    
}
// Output-
// abcdefghijklmnopqrstuvwxyz