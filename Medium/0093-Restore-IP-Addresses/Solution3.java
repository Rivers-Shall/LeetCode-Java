import java.util.ArrayList;
import java.util.List;

public class Solution3 {
    public List<String> restoreIpAddresses(String s) {
        List<String> results = new ArrayList<>();
        char[] ca = s.toCharArray();
        for (int i = 0; i < 3; ++i) {
            for (int j = i + 1; j < i + 4; ++j) {
                for (int k = j + 1; k < j + 4; ++k) {
                    if (k >= ca.length - 1) {
                        break;
                    }
                    int subSeg1 = checkSubSeg(ca, 0, i + 1);
                    int subSeg2 = checkSubSeg(ca, i + 1, j + 1);
                    int subSeg3 = checkSubSeg(ca, j + 1, k + 1);
                    int subSeg4 = checkSubSeg(ca, k + 1, ca.length);
                    if (subSeg1 >= 0 && subSeg2 >= 0 && subSeg3 >= 0 && subSeg4 >= 0) {
                        results.add(subSeg1 + "." + subSeg2 + "." + subSeg3 + "." + subSeg4);
                    }
                }
            }
        }
        return results;
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
        Solution3 s = new Solution3();
        System.out.println(s.restoreIpAddresses("25525511135"));
        System.out.println(s.restoreIpAddresses("0000"));
        System.out.println(s.restoreIpAddresses("000"));
        System.out.println(s.restoreIpAddresses("010010"));
        System.out.println(s.restoreIpAddresses("9245587303"));
    }
}