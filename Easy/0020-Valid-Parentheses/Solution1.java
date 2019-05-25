import java.util.HashMap;
import java.util.Stack;

class Solution1 {
    public boolean isValid(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('(', 0);
        map.put('[', 1);
        map.put('{', 2);
        map.put(')', 6);
        map.put(']', 5);
        map.put('}', 4);

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); ++i) {
            int correspondingValue = map.get(s.charAt(i));
            if (correspondingValue < 4) {
                stack.push(correspondingValue);
            } else if (!stack.empty() && stack.peek() + correspondingValue == 6) {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.isValid("({)}{[()]}"));
    }
}