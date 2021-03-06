import java.util.ArrayList;
import java.util.List;

class Solution2{
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        result.add(new ArrayList<>());
        for (int num : nums) {
            List<Integer> newList = new ArrayList<>();
            newList.add(num);
            result.add(newList);
        }

        int lastStart = 1, lastEnd = result.size() - 1;
        for (int size = 2; size <= nums.length; ++size) {
            int newElementIndex = 0;
            while (newElementIndex < nums.length) {
                int newElement = nums[newElementIndex];
                for (int i = lastStart; i <= lastEnd; ++i) {
                    List<Integer> currentList = result.get(i);
                    if (currentList.get(currentList.size() - 1) < newElement) {
                        List<Integer> list = new ArrayList<>(currentList);
                        list.add(newElement);
                        result.add(list);
                    }
                }
                ++newElementIndex;
            }
            lastStart = lastEnd + 1;
            lastEnd = result.size() - 1;
        }

        return result;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.subsets(new int[] {1, 3, 2}));
        System.out.println(s.subsets(new int[] {}));
        System.out.println(s.subsets(new int[] {2}));
    }
}