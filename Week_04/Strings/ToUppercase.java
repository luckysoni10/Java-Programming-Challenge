//Question- for a given string convert each the first letter of each word to uppercase.

public class ToUppercase {
    public static void main(String[] args) {
        String str = "hi, i'm lucky soni";
        System.out.println("Strings each first word in uppercase: "+toUppercase(str));
    }
    public static String toUppercase(String str) {
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1; i<str.length(); i++) {
            if(str.charAt(i) == ' ' && i<str.length()-1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}

// Output-
// Strings each first word in uppercase: Hi, I'm Lucky Soni