import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    public List<String> restoreIpAddresses(String s) {
        List<String> results = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        char[] ca = s.toCharArray();
        find(ca, 0, 3, sb, results);
        return results;
    }

    private void find(char[] ca, int curr, int nLeft, StringBuilder sb, List<String> results) {
        if (curr >= ca.length)
            return;
        if (nLeft == 0) {
            int subSeg = checkSubSeg(ca, curr, ca.length);
            if (subSeg >= 0) {
                results.add(sb.toString() + '.' + subSeg);
            }
            return;
        }
        for (int i = 1; i <= 3; ++i) {
            if (curr + i > ca.length)
                break;
            int subSeg = checkSubSeg(ca, curr, curr + i);
            if (subSeg >= 0) {
                if (sb.length() != 0) {
                    sb.append('.');
                }
                sb.append(subSeg);
                find(ca, curr + i, nLeft - 1, sb, results);
                int startDelete = sb.lastIndexOf(".");
                if (startDelete < 0) {
                    startDelete = 0;
                }
                sb.delete(startDelete, sb.length());
            }
        }
    }

    private int checkSubSeg(char[] ca, int start, int end) {
        if (end - start > 3) { // too long to be less than 255
            return -1;
        }
        if (ca[start] == '0' && end - start > 1) { // invalid format
            return -1;
        }
        int num = 0;
        for (int i = start; i < end; ++i) {
            num = num * 10 + ca[i] - '0';
        }
        if (num > 255) {
            return -1;
        }
        return num;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.restoreIpAddresses("25525511135"));
        System.out.println(s.restoreIpAddresses("0000"));
        System.out.println(s.restoreIpAddresses("000"));
        System.out.println(s.restoreIpAddresses("010010"));
        System.out.println(s.restoreIpAddresses("9245587303"));
    }
}