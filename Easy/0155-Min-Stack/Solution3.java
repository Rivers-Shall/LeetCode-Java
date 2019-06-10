import java.util.Stack;

class MinStack {
    private Stack<Long> stack = new Stack<>();
    long min = Integer.MAX_VALUE;

    /** initialize your data structure here. */
    public MinStack() {

    }
    
    public void push(int x) {
        stack.push(x - min);
        if (x < min) {
            min = x;
        }
    }
    
    public void pop() {
        long gap = stack.pop();
        if (gap < 0) {
            min -= gap;
        }
    }
    
    public int top() {
        long top = min;
        if (stack.peek() > 0) {
            top += stack.peek();
        }
        return (int) top;
    }
    
    public int getMin() {
        return (int) min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */