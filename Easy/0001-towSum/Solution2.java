
import java.util.HashMap;

class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; ++i) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                result[0] = map.get(complement);
                result[1] = i;
                break;
            } else {
                map.put(nums[i], i);
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        for (int i : s.twoSum(new int[] {2, 2, 3, 4}, 4)) {
            System.out.println(i);
        }
    }
}