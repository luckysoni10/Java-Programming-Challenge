// Write a program to print the multiplication table of a number N, entered by the user.

import java.util.*;

public class Multiplication_Table {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.print("Ente a no. : ");
        int number = sc.nextInt();

        for(int i = 1; i<11; i++) {
            System.out.println(number+" * "+i+" = "+number*i);
        }
    }
}

// Output-
// Ente a no. : 5
// 5 * 1 = 5
// 5 * 2 = 10
// 5 * 3 = 15
// 5 * 4 = 20
// 5 * 5 = 25
// 5 * 6 = 30
// 5 * 7 = 35
// 5 * 8 = 40
// 5 * 9 = 45
// 5 * 10 = 50