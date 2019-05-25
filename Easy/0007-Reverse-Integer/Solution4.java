
class Solution4 {
    public int reverse(int x) {
        int result = 0;

        while (x != 0) {
            int newResult = result * 10 + (x % 10);
            if (newResult / 10 != result) {
                return 0;
            }
            result = newResult;
            x /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution4 s = new Solution4();
        System.out.println(s.reverse(2147483647));
    }
}