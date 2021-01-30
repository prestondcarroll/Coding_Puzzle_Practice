package q4;

import java.util.Stack;

public class MyQueue<T> {

    Stack<T> stackNewest, stackOldest;

    public MyQueue(){
        stackNewest = new Stack<T>();
        stackOldest = new Stack<T>();
    }

    public int size(){
        return stackNewest.size() + stackOldest.size();
    }

    //push
    public void add(T value){
        stackNewest.push(value);
    }

    public void shiftStacks(){
        if(stackOldest.isEmpty()) {
            while (!stackNewest.isEmpty()) {
                stackOldest.push(stackNewest.pop());
            }
        }

    }

    //pop from queue
    public T remove(){
        shiftStacks();
        return stackOldest.pop();
    }

    public T peek(){
        shiftStacks();
        return stackOldest.peek();
    }

}
