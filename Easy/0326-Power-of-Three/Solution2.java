class Solution2 {
    public boolean isPowerOfThree(int n) {
        long powerOfThree = 1;
        while (powerOfThree < n) {
            powerOfThree *= 3;
        }
        return powerOfThree == n;
    }
}