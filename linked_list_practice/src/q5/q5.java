package q5;

import CTCILibrary.LinkedListNode;

public class q5 {

    public q5(){
        LinkedListNode first = new LinkedListNode(7, null, null); //AssortedMethods.randomLinkedList(1000, 0, 2);
        //first = AssortedMethods.randomLinkedList(6, 0, 6);
        LinkedListNode head = first;
        LinkedListNode second = first;

        int[] list = new int[]{1,6};
        for (int i = 0; i < 2; i++) {
            second = new LinkedListNode(list[i]);
            first.setNext(second);
            second.setPrevious(first);
            first = second;
        }

        LinkedListNode first2 = new LinkedListNode(5, null, null); //AssortedMethods.randomLinkedList(1000, 0, 2);
        //first = AssortedMethods.randomLinkedList(6, 0, 6);
        LinkedListNode head2 = first2;
        LinkedListNode second2 = first2;

        int[] list2 = new int[]{9,2};
        for (int i = 0; i < 2; i++) {
            second2 = new LinkedListNode(list2[i]);
            first2.setNext(second2);
            second2.setPrevious(first2);
            first2 = second2;
        }

        System.out.println(head.printForward());
        System.out.println(head2.printForward());
        LinkedListNode combined = sumLists(head,head2, 0);
        System.out.println(combined.printForward());
    }

    public LinkedListNode sumLists(LinkedListNode l1, LinkedListNode l2, int carry){

        LinkedListNode result = new LinkedListNode();
        int value = carry;

        if(l1 == null && l2 == null){
            return null;
        }

        if(l1 == null){
            value += l2.data;
        }
        else if(l2 == null){
            value += l1.data;
        }
        else{
            value += l1.data + l2.data;

        }

        int second_digit = value % 10;
        result.data = second_digit;

         if (l1 != null || l2 != null) {
            LinkedListNode more = sumLists(l1 == null ? null : l1.next,
                                            l2 == null? null : l2.next,
                                            value>= 10? 1 : 0);
            result.setNext(more);
        }

         return result;
    }


}
