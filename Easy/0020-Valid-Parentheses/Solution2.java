import java.util.HashMap;
import java.util.Stack;

class Solution2 {
    public boolean isValid(String s) {
        HashMap<Character, Character> leftToRight = new HashMap<>();
        leftToRight.put('(', ')');
        leftToRight.put('[', ']');
        leftToRight.put('{', '}');

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); ++i) {
            char current = s.charAt(i);
            if (leftToRight.containsKey(current)) {
                stack.push(current);
            } else {
                if (!stack.empty() && current == leftToRight.get(stack.peek())) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}