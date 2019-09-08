class Solution1 {
    public int divide(int dividend, int divisor) {
        int sign = 0;
        if ((dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0)) {
            sign = 1;
        } else {
            sign = -1;
        }
        
        long dividendLongAbs = Math.abs((long) dividend);
        long divisorLongAbs = Math.abs((long) divisor);

        // compute (power of 2) * (abs of divisor)
        long[] divisorTimesPowerOf2 = new long[33];
        divisorTimesPowerOf2[0] = divisorLongAbs;
        int power = 0;
        while (divisorTimesPowerOf2[power] <= dividendLongAbs) {
            divisorTimesPowerOf2[power + 1] = divisorTimesPowerOf2[power] + divisorTimesPowerOf2[power];
            ++power;
        }

        // divide
        long result = 0;
        while (dividendLongAbs >= divisorTimesPowerOf2[0]) {
            while (dividendLongAbs < divisorTimesPowerOf2[power]) {
                --power;
            }
            dividendLongAbs -= divisorTimesPowerOf2[power];
            result += (1L << power);
        }

        if (sign < 0) {
            result = 0L - result;
        }
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return Integer.MAX_VALUE;
        }
        return (int) result;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.divide(7, -3));
        System.out.println(s.divide(10, 3));
        System.out.println(s.divide(Integer.MIN_VALUE, -1));
    }
}