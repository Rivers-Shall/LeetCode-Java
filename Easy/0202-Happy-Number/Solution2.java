import java.util.TreeSet;

class Solution2 {
    public boolean isHappy(int n) {
        TreeSet<Integer> occured = new TreeSet<>();
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
            result += (n % 10) * (n % 10);
            n /= 10;
        }
        return result;
    }
}