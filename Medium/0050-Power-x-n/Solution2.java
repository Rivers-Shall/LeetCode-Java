class Solution2 {
    public double myPow(double x, int n) {
        if (n == 0) return 1;
        if (n < 0) {
            n = -n;
            x = 1 / x;
        }
        if (n == Integer.MIN_VALUE) {
            return myPow(x * x, Integer.MAX_VALUE / 2 + 1);
        }

        if (n % 2 == 0) {
            return myPow(x * x, n / 2);
        } else {
            return x * myPow(x * x, n / 2);
        }
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.myPow(2, 3));
        System.out.println(s.myPow(2, -3));
        System.out.println(s.myPow(2.1, 3));
    }
}