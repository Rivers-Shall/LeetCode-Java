public class Solution1 {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; ++i) {
            result <<= 1;
            result |= (n & 1);
            n >>>= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.reverseBits(43261596));
        System.out.println(s.reverseBits(-3));
    }
}