class MyQueue {
    
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
        
    }
    
    public void push(int x) {
        stack1.push(x);       
    }
    
    public int pop() {
        while(stack1.size() != 0){
            stack2.push(stack1.pop());
        }
        
        int returnVal = stack2.pop();
        
        while(stack2.size() != 0){
            stack1.push(stack2.pop());
        }
        
        return returnVal;
    }
    
    public int peek() {
        while(stack1.size() != 0){
            stack2.push(stack1.pop());
        }
        
        int returnVal = stack2.peek();
        
        while(stack2.size() != 0){
            stack1.push(stack2.pop());
        }
        
        return returnVal;
    }
    
    public boolean empty() {
        if(stack1.size() == 0){
            return true;
        }
        return false;
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