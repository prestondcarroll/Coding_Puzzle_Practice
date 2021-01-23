package q3;

import CTCILibrary.LinkedListNode;

public class q3 {

    public q3(){

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
        deleteMiddle(head.next.next);
        System.out.println(head.printForward());
    }


    public boolean deleteMiddle(LinkedListNode node){

        if(node == null || node.next == null){
            return false;
        }

        LinkedListNode tempNext = node.next.next;

        node.data = node.next.data;
        node.next = tempNext;

        return true;

    }


}
