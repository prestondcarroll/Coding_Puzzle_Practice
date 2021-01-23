package q4;

import CTCILibrary.AssortedMethods;
import CTCILibrary.LinkedListNode;

public class q4 {

    public q4(){
        LinkedListNode first = new LinkedListNode(3, null, null); //AssortedMethods.randomLinkedList(1000, 0, 2);
        //first = AssortedMethods.randomLinkedList(6, 0, 6);
        LinkedListNode head = first;
        LinkedListNode second = first;

        int[] list = new int[]{5,8,5,10,2,1};


        for (int i = 0; i < 6; i++) {
            second = new LinkedListNode(list[i]);
            first.setNext(second);
            second.setPrevious(first);
            first = second;
        }

        System.out.println(head.printForward());
        partition(head, 5);
        System.out.println(head.printForward());


    }

    public LinkedListNode partition(LinkedListNode node, int x){

        LinkedListNode firstStart = null;
        LinkedListNode firstEnd = null;
        LinkedListNode secondStart = null;
        LinkedListNode secondEnd = null;

        while(node != null){
            LinkedListNode next = node.next;
            node.next = null;
            if(node.data < x){
                if(firstStart == null){
                    firstStart = node;
                    firstEnd = node;
                }
                else{
                    firstEnd.next = node;
                    firstEnd = node;
                }

            }
            else{
                if(secondStart == null){
                    secondStart = node;
                    secondEnd = node;
                }
                else{
                    secondEnd.next = node;
                    secondEnd = node;
                }

            }
            node = next;
        }

        firstEnd.next = secondStart;
        return firstStart;


    }

}
