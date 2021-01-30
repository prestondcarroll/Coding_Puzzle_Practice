package q2;
import CTCILibrary.*;

public class q2 {

    public q2(){
        StackWithMin stack = new StackWithMin();
        //StackWithMin2 stack2 = new StackWithMin2();
        int[] array = {2, 1, 3, 1};
        for (int value : array) {
            stack.push(value);
            //stack2.push(value);
            System.out.print(value + ", ");
        }
        System.out.println('\n');
        for (int i = 0; i < array.length; i++) {
            System.out.println("Popped " + stack.pop().value + ", "/* + stack2.pop()8*/ );
            System.out.println("New min is " + stack.min() + ", " /* + stack2.min()*/ );
        }


    }

}
