class Solution1 {
    public int mySqrt(int x) {
        long sqrt = 0;
        while (sqrt * sqrt <= x) {
            ++sqrt;
        }
        return (int) (sqrt - 1);
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.mySqrt(2147395600));
    }
}