import java.util.Arrays;

class Solution1 {
    public int threeSumClosest(int[] nums, int threeSumTarget) {
        Arrays.sort(nums);
        int closestDis = Integer.MAX_VALUE;
        int closestTarget = 0;

        for (int i = 0; i < nums.length; ++i) {
            // no need to check duplicate target
            if (i != 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1, right = nums.length - 1;
            int twoSumTarget = threeSumTarget - nums[i];
            while (left < right) {
                int sum = nums[left] + nums[right];
                int dis = Math.abs(sum - twoSumTarget);
                if (closestDis > dis) {
                    closestDis = dis;
                    closestTarget = sum + nums[i];
                }
                if (sum < twoSumTarget) {
                    ++left;
                } else if (sum > twoSumTarget) {
                    --right;
                } else {
                    // cannot get closer
                    return threeSumTarget;
                }
            }
        }

        return closestTarget;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.threeSumClosest(new int[] {-1, 2, 1, -4}, 1));
    }
}