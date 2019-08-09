import java.util.ArrayList;
import java.util.List;

class Solution1 {
    public List<String> generateParenthesis(int n) {
        List<String> wellFormedStrings = new ArrayList<>();
        return generateParenthesis(new StringBuilder(), n, 0, wellFormedStrings);
    }

    List<String> generateParenthesis(StringBuilder prefix, int nLeftParentheses, int nRightParentheses, List<String> wellFormedStrings) {
        if (nLeftParentheses == 0 && nRightParentheses == 0) {
            wellFormedStrings.add(prefix.toString());
        }

        if (nLeftParentheses != 0) {
            generateParenthesis(prefix.append("("), nLeftParentheses - 1, nRightParentheses + 1, wellFormedStrings);
            prefix.deleteCharAt(prefix.length() - 1);
        }

        if (nRightParentheses != 0) {
            generateParenthesis(prefix.append(")"), nLeftParentheses, nRightParentheses - 1, wellFormedStrings);
            prefix.deleteCharAt(prefix.length() - 1);
        }

        return wellFormedStrings;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.generateParenthesis(3));
    }
}