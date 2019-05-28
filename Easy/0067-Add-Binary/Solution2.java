class Solution2 {
    public String addBinary(String a, String b) {
        int carry = 0;
        StringBuilder result = new StringBuilder();
        for (int i = a.length() - 1, j = b.length() - 1; carry > 0 || i >= 0 || j >= 0;) {
            int val = carry;
            if (i >= 0) val += a.charAt(i--) - '0';
            if (j >= 0) val += b.charAt(j--) - '0';
            result.append(val % 2);
            carry = val / 2;
        }
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.addBinary("1010", "1011"));
    }
}