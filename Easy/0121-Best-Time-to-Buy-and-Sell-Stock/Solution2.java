class Solution2 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) return 0;
        
        int[] diff = new int[prices.length - 1];
        for (int i = 0; i < diff.length; ++i) {
            diff[i] = prices[i + 1] - prices[i];
        }

        return maxSubArray(diff);
    }

    int maxSubArray(int[] array) {
        int prevMax = array[0];
        int max = Math.max(0, array[0]);
        for (int i = 1; i < array.length; ++i) {
            prevMax = Math.max(array[i], array[i] + prevMax);
            max = Math.max(max, prevMax);
        }
        return max;
    }
}