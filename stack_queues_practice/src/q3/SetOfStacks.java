package q3;
import java.util.ArrayList;


public class SetOfStacks {

        ArrayList<Stack> stacks;
        Stack currentStack;
        int capacity;
        int numElements;
        int stackIdx;


        public SetOfStacks(int capacity){

            stacks = new ArrayList<Stack>();

            currentStack = new Stack(capacity);
            stacks.add(currentStack);
            this.capacity = capacity;
            stackIdx = 0;


        }

        public boolean push(int val){

            if(numElements + 1 > capacity){
                currentStack = new Stack(capacity);
                currentStack.push(val);
                stackIdx++;

                stacks.add(currentStack);
                numElements = currentStack.getSize();
            }
            else{
                currentStack.push(val);
                numElements = currentStack.getSize();
            }

            return true;
        }


        public int pop(){
            int n = Integer.MAX_VALUE;
            if(numElements == 1 && stackIdx > 0){
                n = currentStack.pop();
                currentStack = stacks.get(stackIdx - 1);
                numElements = currentStack.getSize();
                stackIdx--;

            }
            else if(numElements != 0){
                n = currentStack.pop();
                numElements = currentStack.getSize();
            }
            return n;

        }


}
