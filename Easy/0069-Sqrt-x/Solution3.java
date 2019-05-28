class Solution3 {
    public int  mySqrt(int x) {
        int left = 0, right = x;
        while (left < right) {
            long mid = left + (right - left) / 2 + 1;
            if (mid * mid > x) {
                right = (int) mid - 1;
            } else if (mid * mid < x) {
                left = (int) mid;
            } else {
                return (int) mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        Solution3 s = new Solution3();
        System.out.println(s.mySqrt(2147395600));
    }
}