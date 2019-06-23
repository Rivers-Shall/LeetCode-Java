import java.util.HashSet;

class Solution3 {
    public boolean isHappy(int n) {
        HashSet<Integer> occured = new HashSet<>();
        while (n != 1) {
            occured.add(n);
            n = next(n);
            if (occured.contains(n)) return false;
        }
        return true;
    }

    private int next(int n) {
        int result = 0;
        while (n != 0) {
            int digit = n % 10;
            result += digit * digit;
            n /= 10;
        }
        return result;
    }
}