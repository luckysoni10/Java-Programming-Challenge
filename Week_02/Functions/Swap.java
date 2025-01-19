import java.util.*;

class Swap {

    public static void swap ( int n1, int n2) {
        int temp = n1;
        n1 = n2; 
        n2 =temp;
        
        System.out.println("After swaping with function : \nfirst value = "+n1+"\nsecond value = "+n2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first no. : ");
        int n1 = sc.nextInt();

        System.out.print("Enter second no. : ");
        int n2 = sc.nextInt();

        swap(n1,n2);
        //call by value

        System.out.println("After the swap function call the values : \nfirst value = "+n1+"\nsecond value "+n2); 
        //value of n1 and n2 will not change because, we have passed the copy of n1 and n2 as a argument, so it will remain same.
    }
}

// Output-
// Enter first no. : 10
// Enter second no. : 5
// After swaping with function :
// first value = 5
// second value = 10
// After the swap function call the values :
// first value = 10
// second value 5