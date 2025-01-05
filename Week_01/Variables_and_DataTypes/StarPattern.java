import java.util.*;
public class StarPattern {
    public static void main(String args[]) {
        System.out.println("Hello World");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of star pattern interm of lines : ");
        int n = s.nextInt();
        for(int i = n; i >0; i--){
            for(int j = 0 ; j<i ; j++) {
                System.out.print(" *");
            }
            System.out.print("\n");
        }
    }
}