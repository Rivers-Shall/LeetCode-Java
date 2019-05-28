class Solution1 {
    public String addBinary(String a, String b) {
        int carry = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; carry > 0 || i < a.length() || i < b.length(); ++i) {
            int val = carry;
            if (i < a.length()) val += a.charAt(a.length() - i - 1) - '0';
            if (i < b.length()) val += b.charAt(b.length() - i - 1) - '0';
            result.append(val % 2);
            carry = val / 2;
        }
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.addBinary("1010", "1011"));
    }
}