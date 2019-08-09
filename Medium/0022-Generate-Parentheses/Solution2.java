import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution2 {
    public List<String> generateParenthesis(int n) {
        List<List<String>> lists = new ArrayList<>();
        lists.add(Collections.singletonList(""));

        for (int nParentheses = 1; nParentheses <= n; ++nParentheses) {
            List<String> list = new ArrayList<>();
            for (int firstNParentheses = 0; firstNParentheses <= nParentheses - 1; ++firstNParentheses) {
                int secondNParentheses = nParentheses - 1 - firstNParentheses;
                List<String> firstList = lists.get(firstNParentheses);
                List<String> secondList = lists.get(secondNParentheses);
                for (String firstString : firstList) {
                    for (String secondString : secondList) {
                        list.add("(" + firstString + ")" + secondString);
                    }
                }
            }
            lists.add(list);
        }

        return lists.get(n);
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.generateParenthesis(3));
    }
}