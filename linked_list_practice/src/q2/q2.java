package q2;

import CTCILibrary.LinkedListNode;

public class q2 {

    public q2(){

        LinkedListNode first = new LinkedListNode(0, null, null); //AssortedMethods.randomLinkedList(1000, 0, 2);
        LinkedListNode head = first;
        LinkedListNode second = first;
        for (int i = 1; i < 8; i++) {
            second = new LinkedListNode(i % 2, null, null);
            first.setNext(second);
            second.setPrevious(first);
            first = second;
        }

        int k = 4;

        findkth(head, k);
        System.out.println(head.printForward());

    }

    int findkth(LinkedListNode head, int k){

        if(head == null){
            return 0;
        }

        int val =  findkth(head.next, k) + 1;
        if(val == k){
            System.out.println("the 3rd to last element is " + head.data);
        }

        return val;


    }


}
