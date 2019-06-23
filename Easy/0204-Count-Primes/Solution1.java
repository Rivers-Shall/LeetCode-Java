class Solution1 {
    public int countPrimes(int n) {
        boolean[] isComp = new boolean[n];
        int result = 0;

        for (int i = 2; i <= Math.sqrt(n); ++i) {
            if (!isComp[i]) {
                ++result;
                for (int j = i * i; j < n; j += i) {
                    isComp[j] = true;
                }
            }
        }
        for (int i = (int) Math.sqrt(n) + 1; i < n; ++i) {
            if (!isComp[i]) ++result;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.countPrimes(10));
    }
}