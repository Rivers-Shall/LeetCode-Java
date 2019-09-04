class Solution1 {
    public boolean canWinNim(int n) {
        boolean[] canWin = new boolean[] { true, true, true, false };
        if (n <= 4) {
            return canWin[n - 1];
        }
        int currentIndex = 3;
        for (int i = 0; i < n - 4; ++i) {
            currentIndex = nextIndex(currentIndex);
            boolean currentCanWin = false;
            for (int j = nextIndex(currentIndex); j != currentIndex; j = nextIndex(j)) {
                currentCanWin |= !canWin[j];
            }
            canWin[currentIndex] = currentCanWin;
        }
        return canWin[currentIndex];
    }

    private int nextIndex(int index) {
        return (index + 1) & 0x3;
    }


    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.canWinNim(4));
        System.out.println(s.canWinNim(5));
        System.out.println(s.canWinNim(8));
        System.out.println(s.canWinNim(1348820612));
    }
}