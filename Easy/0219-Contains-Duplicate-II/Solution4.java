import java.util.HashSet;
import java.util.Set;

class Solution4 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> numSet = new HashSet<>();
        for (int i = 0; i < nums.length; ++i) {
            if (i > k) numSet.remove(nums[i - k - 1]);
            if (!numSet.add(nums[i])) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution4 s = new Solution4();
        System.out.println(s.containsNearbyDuplicate(new int[] {1,2,3,1}, 3));
        System.out.println(s.containsNearbyDuplicate(new int[] {1,0,1,1}, 1));
        System.out.println(s.containsNearbyDuplicate(new int[] {1,2,3,1,2,3}, 2));
    }
}