class Solution2 {
    public int trailingZeroes(int n) {
        int result = 0;
        long divisor = 5;
        while (divisor <= n) {
            result += (n / divisor);
            divisor *= 5;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.trailingZeroes(3));
        System.out.println(s.trailingZeroes(5));
    }
}