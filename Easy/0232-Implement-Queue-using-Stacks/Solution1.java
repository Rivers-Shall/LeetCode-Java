import java.util.Stack;

class MyQueue {
    Stack<Integer> queueOrderStack = new Stack<>();
    Stack<Integer> inversedQueueOrderStack = new Stack<>();

    /** Initialize your data structure here. */
    public MyQueue() {
        
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        inversedQueueOrderStack.push(x);    
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (queueOrderStack.empty()) {
            transfer();
        }
        return queueOrderStack.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        if (queueOrderStack.empty()) {
            transfer();
        }
        return queueOrderStack.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return queueOrderStack.empty() && inversedQueueOrderStack.empty();
    }

    private void transfer() {
        while (!inversedQueueOrderStack.empty()) {
            queueOrderStack.push(inversedQueueOrderStack.pop());
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
