import java.util.ArrayList;

class Solution1 {
    private static class HeightAndIndex {
        int height;
        int index;

        HeightAndIndex(int theHeight, int theIndex) {
            height = theHeight;
            index = theIndex;
        }
    }
    public int maxArea(int[] height) {
        ArrayList<HeightAndIndex> list = new ArrayList<>();
        boolean[] checked = new boolean[height.length];

        for (int i = 0; i < height.length; ++i) {
            list.add(new HeightAndIndex(height[i], i));
        }

        int left = 0, right = checked.length - 1;
        list.sort((a, b) -> (a.height - b.height));
        int max = 0;
        for (int i = 0; i < list.size() - 1; ++i) {
            HeightAndIndex item = list.get(i);
            max = Math.max(max, item.height * (item.index - left));
            max = Math.max(max, item.height * (right - item.index));
            checked[item.index] = true;
            while (checked[left]) ++left;
            while (checked[right]) --right;
        }
        return max;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
    }
}