class Solution1 {
    public String multiply(String num1, String num2) {
        char[] num1CharArray = num1.toCharArray();
        char[] num2CharArray = num2.toCharArray();
        char[] result = new char[240];

        // compute the product
        for (int num2CharArrayIndex = num2CharArray.length - 1; num2CharArrayIndex >= 0; --num2CharArrayIndex) {
            int resultIndexStart = num2CharArray.length - 1 - num2CharArrayIndex;
            int num2Digit = num2CharArray[num2CharArrayIndex] - '0';
            for (int bias = 0; bias < num1CharArray.length; ++bias) {
                int num1CharArrayIndex = num1CharArray.length - 1 - bias;
                int num1Digit = num1CharArray[num1CharArrayIndex] - '0';
                result[resultIndexStart + bias] += num1Digit * num2Digit;
            }
        }
        for (int resultIndex = 0; resultIndex < result.length - 1; ++resultIndex) {
            int carry = result[resultIndex] / 10;
            result[resultIndex] %= 10;
            result[resultIndex + 1] += carry;
        }

        // turn raw number into char
        boolean numberStart = false;
        for (int resultIndex = result.length - 1; resultIndex >= 0; --resultIndex) {
            if (result[resultIndex] != '\0') {
                numberStart = true;
            }
            if (numberStart || resultIndex == 0) {
                result[resultIndex] += '0';
            }
        }
        for (int i = 0, j = result.length - 1; i < j; ++i, --j) {
            char tmp = result[i];
            result[i] = result[j];
            result[j] = tmp;
        }

        return new String(result).trim();
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.multiply("2", "3")); 
        System.out.println(s.multiply("21", "13")); 
        System.out.println(s.multiply("0", "13")); 
    }
}