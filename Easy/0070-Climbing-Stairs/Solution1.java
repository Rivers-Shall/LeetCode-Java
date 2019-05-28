class Solution1 {
    public int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        int f1 = 1, f2 = 2;
        for (int i = 0; i < n - 2; ++i) {
            int next = f1 + f2;
            f1 = f2;
            f2 = next;
        }
        return f2;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.climbStairs(3));
    }
}