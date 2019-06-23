class Solution2 {
    public int countPrimes(int n) {
        boolean[] isComp = new boolean[n];
        int result = 0;

        for (int i = 2; i < n; ++i) {
            if (!isComp[i]) {
                ++result;
                for (long j = (long) i * i; j < n; j += i) {
                    isComp[(int) j] = true;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.countPrimes(10));
    }
}