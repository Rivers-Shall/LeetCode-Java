import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    Queue<Integer> q = new LinkedList<>();
    int top;

    /** Initialize your data structure here. */
    public MyStack() {
        
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        q.add(x);
        top = x;
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        for (int i = 0; i < q.size() - 2; ++i) {
            q.add(q.poll());
        }
        top = q.peek();
        q.add(q.poll());
        return q.poll();
    }
    
    /** Get the top element. */
    public int top() {
        return top;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
