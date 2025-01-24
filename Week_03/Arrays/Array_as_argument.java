import java.util.*;

public class Array_as_argument {
    public static void main(String[] args) {
        int value []= {1,2,3,4,5};

        update(value); //Call by reference. 

        for(int i=0; i<value.length; i++) {
            System.out.print(value[i]+" ");
        }
    }

    public static void update (int value[]) {
        for(int i=0; i<value.length; i++) {
            value[i] += value[i] + 10;
        }
    }
}

// Output-
// 12 14 16 18 20 