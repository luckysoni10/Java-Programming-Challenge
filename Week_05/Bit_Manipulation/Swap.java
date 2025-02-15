public class Swap {
    public static void main(String[] args) {
        int x = 3, y = 4;
        System.out.println("Value before the swap X = 3, Y = 4");
        System.out.println("Value after the swap ");
        swap(x,y);
    }
    public static void swap(int x, int y) {
        x = x ^ y;
        y = x ^ y; 
        x = x ^ y;
        System.out.print("X = "+x+", Y = "+y);
    }
}

// Ouput-
// Value before the swap X = 3, Y = 4
// Value after the swap
// X = 4, Y = 3
