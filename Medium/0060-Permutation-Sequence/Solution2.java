class Solution2 {
    private int[] factorial = new int[] { 1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880 };
    private boolean[] used = new boolean[10];

    public String getPermutation(int n, int k) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; ++i) {
            int fact = factorial[n - i - 1];
            int index = k / fact + (k % fact != 0 ? 1 : 0);
            k %= fact;
            if (k == 0) {
                k = fact;
            }
            for (int j = 1; j <= n; ++j) {
                if (!used[j]) {
                    index--;
                    if (index == 0) {
                        used[j] = true;
                        sb.append(j);
                        break;
                    }
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.getPermutation(3, 3));
        s = new Solution2();
        System.out.println(s.getPermutation(4, 9));
    }
}