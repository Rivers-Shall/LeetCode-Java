
class Solution2 {
    public int reverse(int x) {
        boolean negative = x < 0;

        x = Math.abs(x);
        long result = 0;

        while (x != 0) {
            result = result * 10 + (x % 10);
            x /= 10;
        }

        // do this first, then check for overflow, otherwise it is wrong
        if (negative) {
            result *= -1;
        }
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) result;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.reverse(2147483647));
    }
}