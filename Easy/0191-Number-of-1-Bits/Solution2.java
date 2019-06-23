public class Solution2 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int nBits = 0;
        while (n != 0) {
            ++nBits;
            n &= n - 1;
        }
        return nBits;
    }
}