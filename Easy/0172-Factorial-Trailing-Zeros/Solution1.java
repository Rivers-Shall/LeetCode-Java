class Solution1 {
    public int trailingZeroes(int n) {
        int result = 0;
        while (n != 0) {
            result += n / 5;
            n /= 5;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.trailingZeroes(3));
        System.out.println(s.trailingZeroes(5));
    }
}