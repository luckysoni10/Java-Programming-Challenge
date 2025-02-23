//***Remove Duplicates in a string.
public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "thisstringhasduplicatechar";
        removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
    }
    public static void removeDuplicate(String str, int idx, StringBuilder newStr, boolean map[]) {
        //base case
        if(idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        //work
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true) {
            //dupicate
            removeDuplicate(str, idx+1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicate(str, idx+1, newStr.append(currChar), map);
        }
    }
}
//Output-
// thisrngaduplce