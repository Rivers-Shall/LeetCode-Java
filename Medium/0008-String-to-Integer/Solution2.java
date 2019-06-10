class Solution2 {
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

        int result = 0;
        while (index < charArray.length && Character.isDigit(charArray[index])) {
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && charArray[index] - '0' > 7)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + (charArray[index] - '0');
            ++index;
        }
        return (int) (sign * result);
    }
}