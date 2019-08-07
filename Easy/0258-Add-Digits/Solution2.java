class Solution2 {
    public int addDigits(int num) {
        while (num > 9) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.addDigits(0));
        System.out.println(s.addDigits(38));
        System.out.println(s.addDigits(9));
    }
}