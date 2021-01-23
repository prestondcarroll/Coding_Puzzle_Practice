package q1;
import CTCILibrary.LinkedListNode;

import java.util.HashSet;


public class q1 {

    public q1(){

        LinkedListNode first = new LinkedListNode(0, null, null); //AssortedMethods.randomLinkedList(1000, 0, 2);
        LinkedListNode head = first;
        LinkedListNode second = first;
        for (int i = 1; i < 8; i++) {
            second = new LinkedListNode(i % 2, null, null);
            first.setNext(second);
            second.setPrevious(first);
            first = second;
        }
        System.out.println(head.printForward());

        deleteDups(head);


        System.out.println(head.printForward());






    }

    public void deleteDups(LinkedListNode n){
        HashSet<Integer> set = new HashSet<Integer>();
        LinkedListNode previous = null;

        while(n != null){
            if(set.contains(n.data)){
                previous.next = n.next;
            }
            else{
                set.add(n.data);
                previous = n;
            }
            n = n.next;
        }

    }



}
