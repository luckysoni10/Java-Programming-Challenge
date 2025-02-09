//Question- given a route containing 4 diretion (E,W,N,S), find the shortest path to reach destination.
//ex. "WNEENESENNN"
import java.util.*;

public class ShortestPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the route : ");
        String path = sc.nextLine();
        System.out.println("Shortest path is: "+getShortestPath(path));
    }

    public static float getShortestPath(String path) {
        int x = 0, y = 0;
        for(int i=0; i<path.length(); i++) {
            if(path.charAt(i) == 'N'){
                y++;
            } else if( path.charAt(i) == 'S') {
                y--;
            } else if(path.charAt(i) == 'E') {
                x++;
            } else {
                x--;
            }
        }
        int x2 = x * x, y2 = y * y;
        return (float)Math.sqrt(x2 + y2);
    }
}

// Output-
// Enter the route : WNEENESENNN
// Shortest path is: 5.0