class Solution1 {
    public boolean isPerfectSquare(int num) {
        int left = 0, right = num;
        while (left <= right) {
            long mid = (right - left) / 2 + left;
            long midSquare = mid * mid;
            if (midSquare < num) {
                left = (int) mid + 1;
            } else if (midSquare > num) {
                right = (int) mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.isPerfectSquare(14));
        System.out.println(s.isPerfectSquare(16));
    }
}