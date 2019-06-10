class Solution1 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) return 0;
        for (int i = 0; i < prices.length - 1; ++i) {
            prices[i] = prices[i + 1] - prices[i];
        }
        int[] maxProfitEndAtI = new int[prices.length - 1];
        maxProfitEndAtI[0] = prices[0];
        int maxProfit = Math.max(0, maxProfitEndAtI[0]);
        for (int i = 1; i < maxProfitEndAtI.length; ++i) {
            maxProfitEndAtI[i] = Math.max(prices[i], maxProfitEndAtI[i - 1] + prices[i]);
            maxProfit = Math.max(maxProfit, maxProfitEndAtI[i]);
        }
        return maxProfit;
    }
}