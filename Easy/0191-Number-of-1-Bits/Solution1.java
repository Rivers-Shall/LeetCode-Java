public class Solution1 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int nBits = 0;
        for (int i = 0; i < 32; ++i) {
            if ((n & 1) == 1) {
                ++nBits;
            } 
            n >>>= 1;
        }
        return nBits;
    }
}