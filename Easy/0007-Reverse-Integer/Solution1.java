
class Solution1 {
    public int reverse(int x) {
        long value = x;
        boolean negative = value < 0;
        value = Math.abs(value);

        long result = 0;
        while (value != 0) {
            result = result * 10 + (value % 10);
            value /= 10;
        }
        result = result * ((negative) ? -1 : 1);

        if (result > ((1L << 31) - 1) || result < - (1L << 31)) {
            return 0;
        } 
        return (int) result;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.reverse(2147483647));
    }
}