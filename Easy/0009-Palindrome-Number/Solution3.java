
class Solution3 {
    public boolean isPalindrome(int x) {
        int reverse = 0, tmp = x;
        while (tmp > 0) {
            reverse *= 10;
            reverse += tmp % 10;
            tmp /= 10;
        }
        return reverse == x;
    }

    public static void main(String[] args) {
        Solution3 s = new Solution3();
        System.out.println(s.isPalindrome(11));
    }
}