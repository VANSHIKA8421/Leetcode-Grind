class Solution 
{
    public int maxProfit(int[] prices) 
    {
        int min_buy_price = Integer.MAX_VALUE;
        int profit = 0;
        int max_profit = Integer.MIN_VALUE;
        for(int i = 0 ; i < prices.length ; i++)
        {
            if(prices[i]<min_buy_price)
            {
                min_buy_price=prices[i];
            }
            profit = prices[i]-min_buy_price;
            if(profit>max_profit)
            {
                max_profit = profit;
            }
        }
        return max_profit;
    }
}
// 7, 1, 5, 3, 6, 4
// 