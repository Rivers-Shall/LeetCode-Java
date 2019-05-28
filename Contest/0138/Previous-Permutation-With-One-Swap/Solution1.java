class Solution1 {
    public int[] prevPermOpt1(int[] A) {
        int j;
        for (j = A.length - 2; j >= 0 && A[j] <= A[j + 1]; --j)
            ;
        if (j < 0) return A;
        int i;
        for (i = A.length - 1; i > j && A[i] >= A[j]; --i)
            ;
        if (i == j) return A;
        int tmp = A[j];
        A[j] = A[i];
        A[i] = tmp;
        return A;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        for (int i : s.prevPermOpt1(new int[] {3, 1, 1, 3})) {
            System.out.println(i);
        }
        System.out.println();
        for (int i: s.prevPermOpt1(new int[] {1, 1, 5})) {
            System.out.println(i);
        }
        System.out.println();
        for (int i: s.prevPermOpt1(new int[] {1,9,4,6,7})) {
            System.out.println(i);
        }
    }
}