class Solution1 {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        int interLen = 2 * numRows - 2;
        StringBuilder builder = new StringBuilder();
        for (int nRow = 0; nRow < numRows; ++nRow) {
            for (int interStart = 0; interStart < s.length(); interStart += interLen) {
                if (interStart + nRow < s.length()) {
                    builder.append(s.charAt(interStart + nRow));
                }
                if (nRow > 0 && nRow < numRows - 1 && interStart + interLen - nRow < s.length()) {
                    builder.append(s.charAt(interStart + interLen - nRow));
                }
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        // System.out.println(s.convert("PAYPALISHIRING", 3));
        // System.out.println(s.convert("PAYPALISHIRING", 4));
        System.out.println(s.convert("A", 1));
    }
}