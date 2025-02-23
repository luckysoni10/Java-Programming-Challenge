//Print x to the power n. (x^n)
public class PrintPower {
    public static void main(String[] args) {
        System.out.println(pow(2,10));
        System.out.println(OptimizedPow(2,10));
    }
    public static int pow(int x, int n) { //O(n)
        if(n == 0) {
            return 1;
        }
        return x * pow(x, n-1);
    }
    public static int OptimizedPow(int x, int n) { //O(log n)
        if(n == 0){
            return 1;
        }
        int halfPower = OptimizedPow(x, n/2);
        int halfPowerSq = halfPower * halfPower;

        //n is odd
        if(n % 2 != 0 ) {
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }
}
//Output-
//1024
//1024