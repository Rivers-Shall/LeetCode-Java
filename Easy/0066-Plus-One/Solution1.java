class Solution1 {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        for (int i = digits.length - 1; i >= 0 && carry > 0; --i) {
            digits[i] += 1;
            carry = digits[i] / 10;
            digits[i] %= 10;
        }
        int[] result = digits;
        if (carry == 1) {
            result = new int[digits.length + 1];
            result[0] = 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        int[] result = s.plusOne(new int[] {9, 9});
        for (int i : result) {
            System.out.println(i);
        }
    }
}