//Print factorial of a number n.

public class Factorial {
    public static void main(String[] args) {
        System.out.println("fact: "+ fact(5));
    }

    public static int fact(int n) {
        int fact = 1;
        if(n == 0) {
            return 1;
        }
        fact = n * fact(n - 1);
        return fact;
    }

}

//Output-
//fact: 120