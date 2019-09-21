class Solution1 {
    public double myPow(double x, int n) {
        long nLong = n;
        boolean negativePower = nLong < 0;
        long nLongAbs = Math.abs(nLong);

        long power = 1;
        double result = 1.0;
        while (power <= nLongAbs) {
            if ((nLongAbs & power) != 0) {
                result *= x;
            }
            x *= x;
            power <<= 1;
        }
        if (negativePower) {
            result = 1 / result;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.myPow(2, 3));
        System.out.println(s.myPow(2, -3));
        System.out.println(s.myPow(2.1, 3));
    }
}