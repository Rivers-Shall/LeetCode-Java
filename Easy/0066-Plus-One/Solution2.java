class Solution2 {
    public int[] plusOne(int[] digits) {
        return plusOne(digits, digits.length - 1, 1);
    }

    private int[] plusOne(int[] digits, int lastPos, int carry) {
        if (carry == 0) return digits;
        if (lastPos < 0) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }
        digits[lastPos]++;
        carry = digits[lastPos] / 10;
        digits[lastPos] %= 10;
        return plusOne(digits, lastPos - 1, carry);
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        int[] result = s.plusOne(new int[] {1, 2, 3});
        for (int i : result) {
            System.out.println(i);
        }
    }
}