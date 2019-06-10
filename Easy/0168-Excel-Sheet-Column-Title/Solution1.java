class Solution1 {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            --n;
            char next = (char) ('A' + (n % 26));
            sb.insert(0, next);
            n /= 26;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.convertToTitle(1));
        System.out.println(s.convertToTitle(27));
    }
}