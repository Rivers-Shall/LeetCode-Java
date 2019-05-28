class Solution1 {
    public String countAndSay(int n) {
        StringBuilder str = new StringBuilder("1");
        for (int i = 1; i < n; ++i) {
            StringBuilder newStr = new StringBuilder();
            char[] charArray = str.toString().toCharArray();
            char c = charArray[0];
            int nRepeat = 1;
            for (int j = 1; j < charArray.length; ++j) {
                if (charArray[j] == c) {
                    ++nRepeat;
                } else {
                    newStr.append(nRepeat).append(c);
                    c = charArray[j];
                    nRepeat = 1;
                }
            }
            newStr.append(nRepeat).append(c);
            str = newStr;
        }
        return str.toString();
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.countAndSay(5));
    }
}