import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution3 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> intersectionList = new ArrayList<>();
        int index1 = 0, index2 = 0;
        while (index1 < nums1.length && index2 < nums2.length) {
            if (nums1[index1] == nums2[index2]) {
                intersectionList.add(nums1[index1]);
                ++index1;
                ++index2;
            } else if (nums1[index1] < nums2[index2]) {
                ++index1;
            } else {
                ++index2;
            }
        }

        int[] intersectionArray = new int[intersectionList.size()];
        int index = 0;
        for (int num : intersectionList) {
            intersectionArray[index++] = num;
        }
        return intersectionArray;
    }
}