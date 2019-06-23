import java.util.HashSet;

class Solution1 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numsSet = new HashSet<>();
        for (int num : nums) {
            numsSet.add(num);
        }
        return numsSet.size() < nums.length;
    }
}