
class Solution2 {
    public int strStr(String haystack, String needle) {
        if (needle.equals("")) {
            return 0;
        }
        char[] text = haystack.toCharArray();
        char[] pattern = needle.toCharArray();
        int[] partialMatchTable = new int[pattern.length];

        buildPMT(pattern, partialMatchTable);
        for (int i = 0; i < text.length;) {
            int j;
            for (j = 0; j < pattern.length && i + j < text.length;) {
                if (text[i + j] == pattern[j]) {
                    ++j;
                } else {
                    break;
                }
            }
            if (j == pattern.length) {
                return i;
            } else if (j == 0) {
                ++i;
            } else if (i + j >= text.length) {
                return -1;
            } else {
                i += j - partialMatchTable[j - 1];
            }
        }
        return -1;
    }

    private void buildPMT(char[] pattern, int[] table) {
        for (int i = 1; i < table.length; ++i) {
            int j = table[i - 1];
            while (j > 0) {
                if (pattern[i] == pattern[j]) {
                    break;
                }
                j = table[j - 1];
            }
            if (j == 0) {
                table[i] = (pattern[i] == pattern[0]) ? 1 : 0;
            } else {
                table[i] = j + 1;
            }
        }
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.strStr("ABABCDACS", "ABCDAB"));
    }
}