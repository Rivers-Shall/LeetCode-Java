public class Solution2 {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0;
        result = (n << 16) | (n >>> 16);
        result = ((result & 0x00ff00ff) << 8) | ((result & 0xff00ff00) >>> 8);
        result = ((result & 0x0f0f0f0f) << 4) | ((result & 0xf0f0f0f0) >>> 4);
        result = ((result & 0x33333333) << 2) | ((result & 0xcccccccc) >>> 2);
        result = ((result & 0x55555555) << 1) | ((result & 0xaaaaaaaa) >>> 1);
        return result;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.reverseBits(43261596));
        System.out.println(s.reverseBits(-3));
    }
}