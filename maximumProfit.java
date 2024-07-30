import java.util.*;

class Solution {
    public int maxProfit(int prices[]) {
        int min_Price = prices[0];
        int maxProf = 0;
        for (int i = 1; i < prices.length; i++) {
            maxProf = Math.max(maxProf, prices[i] - min_Price); 
            min_Price = Math.min(prices[i], min_Price); 
        }
        return maxProf;
    }
}

public class maximumProfit { 
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Solution solution = new Solution();
        int maxProfit = solution.maxProfit(arr);
        System.out.println("Best Time to Buy and Sell Stock profit is: " + maxProfit);  
    }
}
