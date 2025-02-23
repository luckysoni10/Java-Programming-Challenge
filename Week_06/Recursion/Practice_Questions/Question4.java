//Question 4
/* We are given a string S, we need to find the count of all contiguous substrings starting and end ending with the same character.
eg- S = "abcab" , Output- 7
there are 15 substrings of "abcab": a, ab, abc, abca, abcab, b, c, ca, bc, bca, ,cab, bcab, a, ab, b
Out of the above substrings, there are 7 substrings: a, abca, b, bcab, c, a, and b. 
so, only 7 contiguous substrings start and end with the same character.
 */

public class Question4 {
    public static void main(String[] args) {
        String str = "abcab";
        int n = str.length();
        System.out.print(countSubstrs(str,0,n-1,n));
    }
    public static int countSubstrs(String str, int i, int j, int n) {
        if (n == 1) {
            return 1;
        }
        if(n <= 0) {
            return 0;
        }

        int res = countSubstrs(str, i+1, j, n-1) + countSubstrs(str, i, j-1, n-1) - countSubstrs(str, i+1, j-1, n-2);

        if(str.charAt(i) == str.charAt(j)) {
            res++;
        }
        return res;
    }
}
//Output-
//7