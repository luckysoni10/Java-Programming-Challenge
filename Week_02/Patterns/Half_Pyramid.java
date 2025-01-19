import java.util.*;

class Half_Pyramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a no. : ");
        int n = sc.nextInt();

        for(int line = 1; line<=n; line++) {
            for(int star =1; star <=line; star++) {
                System.out.print(star);
            }
            System.out.println();
        }

    }
}

// output-
// Enter a no. : 5
// 1
// 12
// 123
// 1234
// 12345