import java.util.Arrays;

class Solution1 {
    public int heightChecker(int[] heights) {
        int[] sorted = new int[heights.length];
        System.arraycopy(heights, 0, sorted, 0, heights.length);
        Arrays.sort(sorted);
        int result = 0;
        for (int i = 0; i < heights.length; ++i) {
            if (sorted[i] != heights[i]) {
                ++result;
            }
        }
        return result;
    }
}