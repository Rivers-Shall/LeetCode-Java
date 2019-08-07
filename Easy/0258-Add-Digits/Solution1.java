class Solution1 {
    public int addDigits(int num) {
        if (num != 0 && num % 9 == 0) {
            return 9;
        } else {
            return num % 9;
        }
    }
}