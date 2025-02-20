//print number from n to 1 (decreasing order).

public class PrintNo {
    public static void main(String[] args) {
        int n = 10;
        printInc(n);
        System.out.println();
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

    public static void printInc (int n) {
        if(n==1) {
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }
}

//output-
// 1 2 3 4 5 6 7 8 9 10 
// 10 9 8 7 6 5 4 3 2 1