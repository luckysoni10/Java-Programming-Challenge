//Convert Upercase Charcter to Lowercase.
public class UppercaseToLowercase {
    public static void main(String[] args) {
        //convert uppercase character to lowercse
        for(char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print((char)(ch | ' '));
        }
    }
}
// Output-
// abcdefghijklmnopqrstuvwxyz