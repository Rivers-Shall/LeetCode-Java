import java.util.HashMap;

class Solution1 {
    private HashMap<Character, Integer> charToNum;

    {
        charToNum = new HashMap<>(7);
        charToNum.put('I', 1);
        charToNum.put('V', 5);
        charToNum.put('X', 10);
        charToNum.put('L', 50);
        charToNum.put('C', 100);
        charToNum.put('D', 500);
        charToNum.put('M', 1000);
    }

    public int romanToInt(String s) {
        int result = 0;
        int prevNum = 10000;
        for (int i = 0; i < s.length(); ++i) {
            int currentNum = charToNum.get(s.charAt(i));
            result += currentNum;
            if (currentNum > prevNum) {
                result -= 2 * prevNum;
            }
            prevNum = currentNum;
        }
        return result;
    }
    
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.romanToInt("MCMXCIV"));
    }
}