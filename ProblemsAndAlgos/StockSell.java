
public class StockSell {

    public static void main(String[] args) {
        int arr[] = { 7,1,5,3,6,4 };
        System.out.println(maxProfit2(arr));
    }

    /*
     * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
     * You are given an array prices where prices[i] is the price of a given stock
     * on the ith day.
     * 
     * You want to maximize your profit by choosing a single day to buy one stock
     * and choosing a different day in the future to sell that stock.
     * 
     * Return the maximum profit you can achieve from this transaction. If you
     * cannot achieve any profit, return 0.
     */

    public static int maxProfit(int[] prices) {

        int maxprofit = 0;
        int minvalue = prices[0];

        for (int i = 0; i < prices.length; i++) {
            int profit = prices[i] - minvalue;
            if (profit > maxprofit)
                maxprofit = profit;

            if (prices[i] < minvalue)
                minvalue = prices[i];

        }
        return maxprofit;

    }

    /*
     * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
     * You are given an integer array prices where prices[i] is the price of a given
     * stock on the ith day.
     * 
     * On each day, you may decide to buy and/or sell the stock. You can only hold
     * at most one share of the stock at any time. However, you can buy it then
     * immediately sell it on the same day.
     * 
     * Find and return the maximum profit you can achieve.
     */
    public static int maxProfit2(int[] prices) {
        int profit=0;

        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                profit+=prices[i]-prices[i-1];
            }
        }
        return profit;

    }
}
