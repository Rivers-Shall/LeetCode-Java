class Solution2 {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;

        StringBuilder[] stringBuilders = new StringBuilder[numRows];
        for (int i = 0; i < numRows; ++i) {
            stringBuilders[i] = new StringBuilder();
        }
        int i = 0;
        while (i < s.length()) {
            // vertically down
            for (int j = 0; j < numRows && i < s.length(); ++j) {
                stringBuilders[j].append(s.charAt(i++));
            }
            // obliquely up
            for (int j = numRows - 2; j > 0 && i < s.length(); --j) {
                stringBuilders[j].append(s.charAt(i++));
            }
        }
        for (int j = 1; j < numRows; ++j) {
            stringBuilders[0].append(stringBuilders[j]);
        }
        return stringBuilders[0].toString();
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.convert("PAYPALISHIRING", 3));
        System.out.println(s.convert("PAYPALISHIRING", 4));
        System.out.println(s.convert("A", 1));
    }
}