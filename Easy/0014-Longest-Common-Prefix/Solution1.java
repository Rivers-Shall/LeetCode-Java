
class Solution1 {
    private String shortest(String[] strings) {
        String shortestString = strings[0];
        for (int i = 1; i < strings.length; ++i) {
            if (strings[i].length() < shortestString.length()) {
                shortestString = strings[i];
            }
        }
        return shortestString;
    }

    private boolean checkPrefix(String[] strings, String prefix) {
        for (String string : strings) {
            if (!string.startsWith(prefix)) {
                return false;
            }
        }
        return true;
    }

    public String longestCommonPrefix(String[] strings) {
        if (strings.length == 0) {
            return new String("");
        }
        String shortestString = shortest(strings);

        int left = 0, right = shortestString.length();
        int length = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (checkPrefix(strings, shortestString.substring(0, mid))) {
                left = mid + 1;
                length = mid;
            } else {
                right = mid - 1;
            }
        }
        return shortestString.substring(0, length);
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.longestCommonPrefix(new String[0]));
    }
}