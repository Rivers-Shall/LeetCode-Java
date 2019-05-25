
class Solution2 {
    private long reverse(int x) {
        long result = 0;

        while (x > 0) {
            result = 10 * result + (x % 10);
            x /= 10;
        }

        return result;
    }

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        if (reverse(x) == x) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.isPalindrome(-12));
    }
}