//Question 2
//You are given a number (eg- 2019), convert it into a String of englihs like- "two zero one nine.
//use a recursive function to solve this problem.
//Note- the digits of the number will only be in the range 0-9 and the last digit of a number can't be 0.

public class Question2 {
    static String digits[] = {"zero", "one", "two", "three", "four", "six", "seven", "eight", "nine"};
    public static void main(String[] args) {
        printDigits(1234);
    }
    public static void printDigits(int number) {
        //base case
        if(number == 0) {
            return;
        }
        //work
        int lastDigit = number % 10;
        //recursive call
        printDigits(number / 10);
        System.out.print(digits[lastDigit]+" ");
    }
}
//Output-
//one two three four 