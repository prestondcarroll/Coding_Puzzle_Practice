package q5;
import java.util.Stack;

public class q5 {

//    public class Result{
//        int low;
//        int high;
//
//    }

    Stack<Integer> s1;
    Stack<Integer> s2;


    public q5(){

        s1 = new Stack<Integer>();
        s2 = new Stack<Integer>();
        s1.push( 5);
        s1.push( 10);
        s1.push( 7);
        s1.push( 12);
        s1.push( 8);
        s1.push( 3);
        s1.push( 1);


        sort();

        while(!s1.isEmpty()){
            System.out.println(s1.pop());
        }



    }

    public void sort(){

        while(!s1.isEmpty()){

            if(s2.isEmpty() || (s1.peek() > s2.peek())){
                s2.push(s1.pop());
            }
            else{
                int temp = s1.pop();
                rearrange(temp);
            }
        }

        //put back into original stack
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }

    public void rearrange(int temp){
        int operations = 0;
        while(!s2.isEmpty() && s2.peek() >= temp){
            s1.push(s2.pop());
            operations++;
        }
        s2.push(temp);

        for(int i =0; i < operations; i++){
            s2.push(s1.pop());
        }

    }



}
