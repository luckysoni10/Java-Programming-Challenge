//Trapping Rainwater Problem
import java.util.*;
public class Trapping_Rainwater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the count of bars : ");
        int n = sc.nextInt();
        int height[] = new int[n];
        System.out.println("Enter the height of the bars : ");
        for(int i=0; i<height.length; i++) {
            height[i] = sc.nextInt();
        }
        System.out.println("Total Trapped Rainwater is : "+trappedRainwater(height));
    }

    public static int trappedRainwater (int height[]) {
        int trappedRainwater = 0, n = height.length;

        int maxLeftBoundary[] = new int[n];
        maxLeftBoundary[0] = height[0];

        int maxRightBoundary[] = new int[n];
        maxRightBoundary[n-1] = height[n-1];

        //calculate max left boundary 
        for(int i=1; i<n; i++) {
            maxLeftBoundary[i] = Math.max(height[i], maxLeftBoundary[i-1]);
        }

        //calculate max right boundary 
        for(int i=n-2; i>=0; i--) {
            maxRightBoundary[i] = Math.max(height[i], maxRightBoundary[i+1]);
        }

        for(int i=0; i<n; i++) {
            //water level = min(max left boundary , max right boundary)
            int waterLevel = Math.min(maxLeftBoundary[i], maxRightBoundary[i]);

            //trapped water = (water level - height)
            trappedRainwater += waterLevel - height[i];
        }

        return trappedRainwater;
    }
}

// Output-
// Enter the count of bars : 7
// Enter the height of the bars :
// 4
// 2
// 0
// 6
// 3
// 2
// 5
// Total Trapped Rainwater is : 11