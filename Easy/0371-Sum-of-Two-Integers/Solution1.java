class Solution1 {
    public int getSum(int a, int b) {
        int carry = 0;
        int sum = 0;

        for (int i = 0; i < 32; ++i) {
            int aCurrentBit = (a >>> i) & 0x1; 
            int bCurrentBit = (b >>> i) & 0x1; 
            int sumCurrentBit = aCurrentBit ^ bCurrentBit ^ carry;
            carry = (aCurrentBit & carry) | (bCurrentBit & carry) | (aCurrentBit & bCurrentBit);
            sum |= (sumCurrentBit << i);
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.getSum(1, 2));
        System.out.println(s.getSum(1, -2));
    }
}