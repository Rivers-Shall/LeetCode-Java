import java.util.Arrays;
import java.util.Comparator;

class Solution {
    private class ByLength implements Comparator<String> {
        public int compare(String a, String b) {
            if (a.length() > b.length()) {
                return -1;
            } else if (a.length() < b.length()) {
                return 1;
            }
            return 0;
        }
    }

    private boolean isPredecessor(String prev, String cur) {
        int prevIndex = 0, curIndex = 0;
        while (prevIndex < prev.length() && curIndex < cur.length()) {
            if (prev.charAt(prevIndex) == cur.charAt(curIndex)) {
                ++curIndex;
            }
            ++prevIndex;
        }
        if (curIndex == cur.length()) return true;
        return false;
    }

    public int longestStrChain(String[] words) {
        Arrays.sort(words, new ByLength());
        int[] maxChainLen = new int[words.length];
        int prevLeft = 0, prevRight = 0;
        for (; prevRight < words.length && words[prevRight].length() == words[prevLeft].length(); ++prevRight) {
            maxChainLen[prevRight] = 1;
        }
        
        while (prevRight < words.length) {
            int curLeft = prevRight, curRight = curLeft;
            for (; curRight < words.length && words[curRight].length() == words[curLeft].length(); ++curRight) {
                maxChainLen[curRight] = 1;
                if (words[curRight].length() < words[prevLeft].length() - 1) {
                    continue;
                }
                for (int prev = prevLeft; prev < prevRight; ++prev) {
                    if (isPredecessor(words[prev], words[curRight]) && maxChainLen[prev] + 1 > maxChainLen[curRight]) {
                        maxChainLen[curRight] = maxChainLen[prev] + 1;
                    }
                }
            }
            prevLeft = curLeft;
            prevRight = curRight;
        }

        int max = 0;
        for (int chainLen : maxChainLen) {
            if (max < chainLen) {
                max = chainLen;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.longestStrChain(new String[] {"sgtnz","sgtz","sgz","ikrcyoglz","ajelpkpx","ajelpkpxm","srqgtnz","srqgotnz","srgtnz","ijkrcyoglz"}));
    }
}