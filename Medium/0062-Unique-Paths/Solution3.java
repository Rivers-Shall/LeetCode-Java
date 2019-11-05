class Solution3 {

    public int uniquePaths(int m, int n) {
        int maxStep = Math.min(m, n);
        int maxDis = m + n - 2;
        int[] nWays = new int[maxStep];

        nWays[0] = 1;
        for (int dis = 1; dis <= maxDis; ++dis) {
            if (dis < maxStep) { // first maxStep - 2 rounds
                for (int i = dis; i >= 1; --i) {
                    nWays[i] = nWays[i - 1] + nWays[i];
                }
            } else if (maxDis - dis + 1 < maxStep) { // last maxStep - 2 rounds
                for (int i = maxStep - 1; i >= maxStep + dis - maxDis - 1; --i) {
                    nWays[i] = nWays[i - 1] + nWays[i];
                }
            } else {
                for (int i = maxStep - 1; i >= 1; --i) {
                    nWays[i] = nWays[i - 1] + nWays[i];
                }
            }
        }
        return nWays[maxStep - 1];
    }

    public static void main(String[] args) {
        Solution3 s = new Solution3();
        System.out.println(s.uniquePaths(3, 2));
        System.out.println(s.uniquePaths(2, 3));
        System.out.println(s.uniquePaths(7, 3));
        System.out.println(s.uniquePaths(3, 7));
    }
}