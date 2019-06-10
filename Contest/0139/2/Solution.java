import java.util.*;
class Solution {
    class Comp implements Comparator<int[]> {
        public int compare(int[] a, int[] b) {
            for (int i = 0; i < a.length; ++i) {
                if (a[i] < b[i]) {
                    return -1;
                } else if (a[i] > b[i]) {
                    return 1;
                }
            }
            return 0;
        }
    }

    class CompInverse implements Comparator<int[]> {
        public int compare(int[] a, int[] b) {
            for (int i = 0; i < a.length; ++i) {
                if (a[i] == b[i]) {
                    return -1;
                }
            }
            return 0;
        }
    }
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        int max = 1;
        Comparator<int[]> comp = new Comp();
        Comparator<int[]> compInverse = new CompInverse();
        boolean[] checked = new boolean[matrix.length];
        for (int i = 0; i < matrix.length; ++i) {
            int count = 1;
            if (!checked[i]) checked[i] = true;
            for (int j = 0; j < matrix.length; ++j) {
                if (j == i) continue;
                if (comp.compare(matrix[i], matrix[j]) == 0 || compInverse.compare(matrix[i], matrix[j]) == 0) {
                    ++count;
                    checked[j] = true;
                }
            }
            max = Math.max(max, count);
        }
        return max;
    }

    public static void main(String[] args) {
        
    }
}