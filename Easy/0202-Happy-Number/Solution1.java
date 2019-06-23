class Solution1 {
    private int next(int n) {
        int digitSqrSum = 0;
        while (n != 0) {
            digitSqrSum += (n % 10) * (n % 10);
            n /= 10;
        }
        return digitSqrSum;
    }

    public boolean isHappy(int n) {
        int oneStep = next(n);
        int twoStep = next(oneStep);

        while (twoStep != 1 && twoStep != oneStep) {
            oneStep = next(oneStep);
            twoStep = next(next(twoStep));
        }
        
        return twoStep == 1;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.isHappy(19));
    }
}