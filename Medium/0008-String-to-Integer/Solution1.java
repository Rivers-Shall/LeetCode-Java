class Solution1 {
    public int myAtoi(String str) {
        if (str == null) return 0;

        char[] charArray = str.toCharArray();
        int index = 0;
        while (index < charArray.length && charArray[index] == ' ') {
            ++index;
        }

        int sign = 1;
        if (index < charArray.length && (charArray[index] == '-' || charArray[index] == '+')) {
            if (charArray[index] == '-') {
                sign = -1;
            }
            ++index;
        }

        long result = 0;
        while (index < charArray.length && Character.isDigit(charArray[index])) {
            result = result * 10 + (charArray[index] - '0');
            if (result * sign > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (result * sign < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            ++index;
        }
        return (int) (sign * result);
    }
}