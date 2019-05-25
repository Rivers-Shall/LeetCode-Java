class Solution3 {
    public int reverse(int x) {
        long result = 0;
        
        // Amazing!!! This works for both positive and negative number in Java!!!
        while (x != 0) {
            result *= 10;
            result += x % 10;
            x /= 10;
        }
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) result;
    }
}