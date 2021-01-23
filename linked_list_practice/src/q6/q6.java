package q6;
import CTCILibrary.LinkedListNode;

import java.util.Stack;

public class q6 {

    public q6(){

        LinkedListNode first = new LinkedListNode(10, null, null); //AssortedMethods.randomLinkedList(1000, 0, 2);
        //first = AssortedMethods.randomLinkedList(6, 0, 6);
        LinkedListNode head = first;
        LinkedListNode second = first;

        //int[] list = new int[]{1,3,5,3,1,10};
        int[] list = new int[]{1,2,3,4,5,6};


        for (int i = 0; i < 6; i++) {
            second = new LinkedListNode(list[i]);
            first.setNext(second);
            second.setPrevious(first);
            first = second;
        }

        System.out.println(head.printForward());
        System.out.println("is it a palinedrone? " + checkPalin(head));

    }

    public boolean checkPalin(LinkedListNode list){

        LinkedListNode head = list;
        Stack<Integer> stack = new Stack<Integer>();

        while(head != null){
            stack.push(head.data);
            head = head.next;
        }

        head = list;
        while(head != null){
            if(head.data != stack.pop()){
                return false;
            }
            head = head.next;

        }



        return true;


    }


}
