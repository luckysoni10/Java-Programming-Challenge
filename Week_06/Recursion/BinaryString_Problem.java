//** Binary String Problem
//Print all binary strings of size N without consecutive ones.

public class BinaryString_Problem {
    public static void main(String[] args) {
        binaryStrings(3,0, "");
    }
    public static void binaryStrings(int n, int lastPlace, String str) {
        //base
        if(n == 0 ) {
            System.out.println(str);
            return;
        }
        //work
        binaryStrings(n-1, 0, str+"0");
        if(lastPlace == 0) {
            binaryStrings(n-1, 1, str+"1");
        }

    }
}
// Output-
// 000
// 001
// 010
// 100
// 101