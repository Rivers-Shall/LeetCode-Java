class Solution1 {
    private int nPermutation = 0;
    private boolean[] used = new boolean[10];

    public String getPermutation(int n, int k) {
        nPermutation = 0;
        return getPermutation(n, k, new StringBuilder());
    }

    private String getPermutation(int n, int k, StringBuilder sb) {
        if (sb.length() == n) {
            ++nPermutation;
            if (nPermutation == k) {
                return sb.toString();
            } else {
                return "";
            }
        }

        for (int i = 1; i <= n; ++i) {
            String s;
            if (!used[i]) {
                used[i] = true;
                s = getPermutation(n, k, sb.append(i));
                used[i] = false;
                sb.deleteCharAt(sb.length() - 1);
                if (s.length() == n) {
                    return s;
                }
            }
        }
        return "";
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.getPermutation(3, 3));
        System.out.println(s.getPermutation(4, 9));
    }
}