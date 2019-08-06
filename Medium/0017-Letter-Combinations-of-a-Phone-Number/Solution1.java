import java.util.ArrayList;
import java.util.List;

class Solution1 {
    String[] digit2letters = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if (!digits.equals("")) {
            letterCombinations(new StringBuilder(), digits, combinations);
        }
        return combinations;
    }

    private void letterCombinations(StringBuilder sb, String digits, List<String> combinations) {
        if (sb.length() == digits.length()) {
            combinations.add(sb.toString());
            return;
        }

        char[] possibleLetters = digit2letters[digits.charAt(sb.length()) - '2'].toCharArray();
        for (char c : possibleLetters) {
            letterCombinations(sb.append(c), digits, combinations);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.letterCombinations("23"));
    }
}