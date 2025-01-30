/* You are given an array prices where price[i] stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock return the maximum profit you can achieve from this transaction. 
if you cannot achieve any profit, return 0. 
*/
import java.util.*;
public class BuyAndSell_Stock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of days : ");
        int n = sc.nextInt();

        System.out.print("Enter the prices of days : ");
        int prices[] = new int[n];
        for(int i=0; i<n; i++) {
            prices[i] = sc.nextInt();
        }

        System.out.println("Maximum Profit can be : "+buySellStock(prices));
    }

    public static int buySellStock (int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++) {
            if(buyPrice < prices[i]) { //profit
                int profit = prices[i] - buyPrice; //today's profit
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
}

// Output-
// Enter the no. of days : 6
// Enter the prices of days : 7
// 1
// 5
// 3
// 6
// 4
// Maximum Profit can be : 5