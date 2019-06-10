import java.util.ArrayList;

class Solution2 {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int max = 0;
        while (left < right) {
            max = Math.max(max, Math.min(height[left], height[right]) * (right - left));
            if (height[left] < height[right]) {
                ++left;
            } else {
                --right;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
    }
}