import java.util.ArrayList;
import java.util.List;

public class Solution1 {
    public List<String> restoreIpAddresses(String s) {
        List<String> results = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        find(s, 0, 3, sb, results);
        return results;
    }

    private void find(String s, int curr, int nLeft, StringBuilder sb, List<String> results) {
        if (curr >= s.length())
            return;
        if (nLeft == 0) {
            String sub = s.substring(curr);
            if (sub.length() <= 3 && !sub.matches("0.+") && Integer.parseInt(sub) <= 255) {
                results.add(sb.toString() + '.' + sub);
            }
            return;
        }
        for (int i = 1; i <= 3; ++i) {
            if (curr + i > s.length())
                break;
            String sub = s.substring(curr, curr + i);
            if (!sub.matches("0.+") && Integer.parseInt(sub) <= 255) {
                if (sb.length() != 0) {
                    sb.append('.');
                    sb.append(sub);
                } else {
                    sb.append(sub);
                }
                find(s, curr + i, nLeft - 1, sb, results);
                int startDelete = sb.lastIndexOf(".");
                if (startDelete < 0) {
                    startDelete = 0;
                }
                sb.delete(startDelete, sb.length());
            }
        }
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.restoreIpAddresses("25525511135"));
        System.out.println(s.restoreIpAddresses("0000"));
        System.out.println(s.restoreIpAddresses("000"));
        System.out.println(s.restoreIpAddresses("010010"));
        System.out.println(s.restoreIpAddresses("9245587303"));
    }
}