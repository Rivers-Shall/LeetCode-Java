import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution1 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> nums1ToOccurTimes = new HashMap<>();
        for (int num : nums1) {
            int occurTimes = nums1ToOccurTimes.getOrDefault(num, 0) + 1;
            nums1ToOccurTimes.put(num, occurTimes);
        }

        List<Integer> intersectionList = new ArrayList<>();
        for (int num : nums2) {
            int occurTimes = nums1ToOccurTimes.getOrDefault(num, 0);
            if (occurTimes > 0) {
                intersectionList.add(num);
                --occurTimes;
                nums1ToOccurTimes.put(num, occurTimes);
            }
        }

        return intersectionList.stream().mapToInt(Number::intValue).toArray();
    }
}