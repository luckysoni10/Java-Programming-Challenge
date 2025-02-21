//Print sum of first n natural numbers.
public class PrintSum {
    public static void main(String[] args) {
        System.out.println("Sum of first 10 natural no. is: "+sum(10));
    }

    public static int sum(int n) {
        int s = 0;
        if(n == 1 ){
            return 1;
        }
        s = n + sum(n - 1);
        return s;
    }
}
//Output-
// Sum of first 10 natural no. is: 55