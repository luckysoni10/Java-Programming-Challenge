import java.util.*;

public class IncomeTaxCalculator {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Income : ");
        int income = sc.nextInt();
        float tax;

        if(income <500000 ) {
            tax = 0;
            System.out.println("0% tax for income " + income + " is "+tax);
        } 
        else if(income < 1000000) {
            tax = (income * (0.2f));
            System.out.println("20% tax of "+income+" is : " + tax);
        } 
        else {
            tax = (income * (0.3f));
            System.out.println("20% tax of "+income+" is : " + tax);
        }
    }
}
