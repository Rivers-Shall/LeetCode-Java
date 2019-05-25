import java.util.Comparator;
import java.util.Arrays;


class Solution {

    private class IndexedValue {
        private int index;
        private int value;

        IndexedValue(int anIndex, int aValue) {
            index = anIndex;
            value = aValue;
        }
    }
    
    private class ByValue implements Comparator<IndexedValue> {
        public int compare(IndexedValue a, IndexedValue b) {
            if (a.value < b.value) {
                return -1;
            } else if (a.value > b.value) {
                return 1;
            }
            return 0;
        }
    }

    public int[] twoSum(int[] nums, int target) {
        IndexedValue[] indexedValues = new IndexedValue[nums.length];
        for (int i = 0; i < nums.length; ++i) {
            indexedValues[i] = new IndexedValue(i, nums[i]);
        }
        Arrays.sort(indexedValues, new ByValue());
        int[] result = new int[2];
        for (int i = 0, j = indexedValues.length - 1; i < j;) {
            int sum = indexedValues[i].value + indexedValues[j].value;
            if (sum < target) {
                ++i;
            } else if (sum > target) {
                --j;
            } else {
                result[0] = indexedValues[i].index ;
                result[1] = indexedValues[j].index;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        for (int i : s.twoSum(new int[]{ 2, 7, 11, 15 }, 9)) {
            System.out.println(i);
        }
    }
}