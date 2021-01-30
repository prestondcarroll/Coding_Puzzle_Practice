package q2;
import q2.NodeWithMin;
import java.util.Stack;

public class StackWithMin extends Stack<NodeWithMin>{

    public void push(int val){
        if(this.isEmpty()){
            super.push(new NodeWithMin(val, val));
        }
        else if(val < this.peek().min){
            super.push(new NodeWithMin(val, val));
        }
        else{
            super.push(new NodeWithMin(val, min()));
        }

    }


    public int min(){
        if(this.isEmpty()){
            return Integer.MAX_VALUE;
        }
        else{
            return this.peek().min;
        }
    }




}
