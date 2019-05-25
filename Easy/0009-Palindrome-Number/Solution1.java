
class Solution1 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x > 0 && x % 10 == 0) {
            return false;
        }
        if (x == 0) {
            return true;
        }
        int reverse = 0;

        while (reverse < x) {
            int digit = x % 10;
            x /= 10;
            if (x == reverse) {
                return true;
            }
            reverse = reverse * 10 + digit;
            if (x == reverse) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.isPalindrome(10));
    }
}