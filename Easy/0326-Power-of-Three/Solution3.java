class Solution3 {
    public boolean isPowerOfThree(int n) {
        String base3IntStr = Integer.toString(n, 3);
        return base3IntStr.matches("^10*");
    }
}