import java.util.Arrays;
import java.util.Comparator;

class Solution1 {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return intervals;

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(final int[] a, final int[] b) {
                if (a[0] > b[0]) {
                    return 1;
                } else if (a[0] < b[0]) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        int nMerged = 1;
        for (int i = 1; i < intervals.length; ++i) {
            if (intervals[i][0] <= intervals[nMerged - 1][1]) {
                intervals[nMerged - 1][1] = Math.max(intervals[i][1], intervals[nMerged - 1][1]);
            } else {
                nMerged++;
                intervals[nMerged - 1][0] = intervals[i][0];
                intervals[nMerged - 1][1] = intervals[i][1];
            }
        }
        int[][] mergedIntervals = new int[nMerged][];
        for (int i = 0; i < nMerged; ++i) {
            mergedIntervals[i] = intervals[i];
        }
        return mergedIntervals;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(Arrays.deepToString(s.merge( new int[][] {
            {1, 3}, {2, 6}, {8, 10}, {15, 18}
        })));
        System.out.println(Arrays.deepToString(s.merge( new int[][] {
            {8, 10}, {2, 6}, {1, 3}, {15, 18}
        })));
        System.out.println(Arrays.deepToString(s.merge( new int[][] {
            {1, 4}, {4, 5}
        })));
    }
}