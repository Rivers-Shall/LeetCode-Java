class Solution1 {
    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
        int[] modifiedGrumpy = new int[grumpy.length];
        System.arraycopy(grumpy, 0, modifiedGrumpy, 0, grumpy.length);
        for (int i = 0; i < X; ++i) {
            modifiedGrumpy[i] = 0;
        }
        int result = 0;
        int max = 0;
        for (int i = 0; i < customers.length; ++i) {
            if (modifiedGrumpy[i] == 0) {
                result += customers[i];
            }
        }
        max = result;
        for (int modifiedStart = 0; modifiedStart < grumpy.length - X; ++modifiedStart) {
            result -= grumpy[modifiedStart] * customers[modifiedStart];
            result += grumpy[modifiedStart + X] * customers[modifiedStart + X];
            max = Math.max(max, result);
        }
        return max;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.maxSatisfied(new int[] {1,0,1,2,1,1,7,5}, new int[] {0,1,0,1,0,1,0,1}, 3));
    }
}