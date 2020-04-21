
public class Solution1 {
    public int numDecodings(String s) {
        char[] ca = s.toCharArray();
        int prev = 1;
        int result = s.startsWith("0") ? 0 : 1;
        for (int i = 1; i < ca.length; ++i) {
            if (ca[i - 1] == '1' || (ca[i - 1] > '0' && ca[i - 1] <= '2' && ca[i] <= '6')) { // 当前有两种解析方式
                int tmp = prev;
                prev = result;
                result = tmp;
            } else { // 当前无法有两种解析方式
                prev = result;
                result = 0;
            }
            if (ca[i] != '0') { // '0' 不可以单独作出解码
                result += prev;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.numDecodings("12"));
        System.out.println(s.numDecodings("226"));
        System.out.println(s.numDecodings("826"));
        System.out.println(s.numDecodings("286"));
        System.out.println(s.numDecodings("10"));
        System.out.println(s.numDecodings("20"));
        System.out.println(s.numDecodings("220"));
        System.out.println(s.numDecodings("0"));
        System.out.println(s.numDecodings("00"));
    }
}