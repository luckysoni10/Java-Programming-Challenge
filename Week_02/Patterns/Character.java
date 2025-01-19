import java.util.*;

class Character {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the max line no : ");
        int n = sc.nextInt();

        char ch = 'A';

        for(int line=1; line<=n; line++) {
            for(int chars =1; chars <=line; chars++) {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }

    }
}

// output-
// Enter the max line no : 5
// A 
// B C
// D E F
// G H I J
// K L M N O 