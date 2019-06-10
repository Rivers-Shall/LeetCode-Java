import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] addNegabinary(int[] arr1, int[] arr2) {
        BigInteger num1 = BigInteger.valueOf(0);
        for (int i = 0; i < arr1.length; ++i) {
            num1 = num1.multiply(BigInteger.valueOf(-2)).add(BigInteger.valueOf(arr1[i]));
        }     
        BigInteger num2 = BigInteger.valueOf(0);
        for (int i = 0; i < arr2.length; ++i) {
            num2 = num2.multiply(BigInteger.valueOf(-2)).add(BigInteger.valueOf(arr2[i]));
        }     
        BigInteger sum = num1.add(num2);
        ArrayList<Integer> result = new ArrayList<>();
        while (!sum.equals(BigInteger.valueOf(0))) {
            long digit = sum.mod(BigInteger.valueOf(2)).intValue();
            if (digit < 0) digit += 2;
            result.add((int) digit);
            sum = sum.subtract(BigInteger.valueOf(digit)).divide(BigInteger.valueOf(-2));
        }
        Collections.reverse(result);
        if (result.size() == 0) {
            result.add(0);
        }
        int[] arrayResult = new int[result.size()];
        for (int i = 0; i < arrayResult.length; ++i) {
            arrayResult[i] = (int) result.get(i);
        }
        return arrayResult;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr1 = new int[]{1, 1, 1, 1, 0};
        int[] arr2 = new int[]{1, 0, 1};
        System.out.println(Arrays.toString(s.addNegabinary(arr1, arr2)));
    }
}