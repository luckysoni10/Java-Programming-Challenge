//Print Nth Fibonacci number.
public class NthFibonacciNo {
    public static void main(String[] args) {
        System.out.println("10th fibonacci no. is : "+fibonacci(5));    
    }

    public static int fibonacci(int n) {
        int fibN = 0;
        if(n == 0 || n ==1) {
            return n;
        }
        int fibN1 = fibonacci(n-1);
        int fibN2 = fibonacci(n-2);
        fibN = fibN1 + fibN2;
        return fibN;
    }
}
//Output-
// 10th fibonacci no. is : 55
