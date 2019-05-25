
class Solution4 {
    public boolean isPalindrome(int x) {
        if (x > 0 && x % 10 == 0) {
            return false;
        }

        int reverse = 0;

        while (reverse < x) {
            int digit = x % 10;
            x /= 10;
            reverse = reverse * 10 + digit;
        }
        return reverse == x || reverse / 10 == x;
    }

    public static void main(String[] args) {
        Solution4 s = new Solution4();
        System.out.println(s.isPalindrome(0));
    }
}