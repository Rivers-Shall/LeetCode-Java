import java.util.PriorityQueue;
import java.util.Comparator;

class Solution1 {
    private class CodeAndFreq {
        int code;
        int freq;

        CodeAndFreq(int aCode, int aFreq) {
            this.code = aCode;
            this.freq = aFreq;
        }
    }

    private class ByFreq implements Comparator<CodeAndFreq> {
        @Override
        public int compare(CodeAndFreq a, CodeAndFreq b) {
            return a.freq - b.freq;
        }
    }

    public int[] rearrangeBarcodes(int[] barcodes) {
        PriorityQueue<CodeAndFreq> codeAndFreqs = new PriorityQueue<>(new ByFreq());
        
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        for (int i : s.rearrangeBarcodes(new int[] {1, 1, 2})) {
            System.out.println(i);
        }
    }
}