//print number from n to 1 (decreasing order).

public class PrintNo {
    public static void main(String[] args) {
        int n = 10;
        printDec(n);
    }
    public static void printDec (int n) {
        if(n==1) {
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
}

//output-
//10 9 8 7 6 5 4 3 2 1