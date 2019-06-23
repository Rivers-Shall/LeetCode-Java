import java.util.Arrays;

class Solution2 {
    static class NumAndIndex {
        int num;
        int index;

        NumAndIndex(int aNum, int aIndex) {
            this.num = aNum;
            this.index = aIndex;
        }
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        NumAndIndex[] numAndIndexs = new NumAndIndex[nums.length];
        for (int i = 0; i < nums.length; ++i) {
            numAndIndexs[i] = new NumAndIndex(nums[i], i);
        }
        Arrays.sort(numAndIndexs, (a, b) -> 
                                  ((a.num - b.num == 0) ? 
                                   (a.index - b.index) : 
                                   (a.num - b.num)));
        for (int i = 1; i < nums.length; ++i) {
            if (numAndIndexs[i].num == numAndIndexs[i - 1].num && numAndIndexs[i].index - numAndIndexs[i - 1].index <= k) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.containsNearbyDuplicate(new int[] {1,2,3,1}, 3));
        System.out.println(s.containsNearbyDuplicate(new int[] {1,0,1,1}, 1));
        System.out.println(s.containsNearbyDuplicate(new int[] {1,2,3,1,2,3}, 2));
    }
}