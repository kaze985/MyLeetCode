public class _122 {
    public int maxProfit(int[] prices) {
        int result = 0;
        if (prices.length < 2) {
            return result;
        }
        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - prices[i - 1];
            if (profit > 0) {
                result += profit;
            }
        }
        return result;
    }
}
