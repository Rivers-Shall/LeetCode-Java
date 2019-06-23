import java.util.HashMap;
import java.util.Map;

class Solution1 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> num2Index = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            if (num2Index.containsKey(nums[i]) && i - num2Index.get(nums[i]) <= k) {
                return true;
            }
            // no matter whether nums[i] is contained
            // it needs to be the largest index
            num2Index.put(nums[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.containsNearbyDuplicate(new int[] {1,2,3,1}, 3));
        System.out.println(s.containsNearbyDuplicate(new int[] {1,0,1,1}, 1));
        System.out.println(s.containsNearbyDuplicate(new int[] {1,2,3,1,2,3}, 2));
    }
}