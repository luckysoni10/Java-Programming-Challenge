import java.util.*;

public class Basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstName = "lucky";
        String lastName = new String("soni");
        String fullName = firstName +" "+ lastName;
        System.out.println(fullName);
        System.out.println(fullName.length()); //it will print the length of string fullName.

        System.out.print("Enter your city: ");
        String city = sc.nextLine(); 
        System.out.println(city);


        String str = "My name is Lucky Soni";
        System.out.println(str.charAt(0)); //it will print the char at index 0

        for(int i=0; i<str.length(); i++) {
            System.out.print(str.charAt(i)+" "); //it will print all character one by one 
        }
        System.out.println();

    }
}

// Output-
// lucky soni
// 10
// Enter your city: jabalpur madhya pradesh
// jabalpur madhya pradesh
// M
// M y   n a m e   i s   L u c k y   S o n i 