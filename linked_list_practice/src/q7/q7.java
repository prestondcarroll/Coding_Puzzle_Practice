package q7;
import CTCILibrary.LinkedListNode;

public class q7 {

    int l1Size = 0;
    int l2Size = 0;


    public q7(){

        LinkedListNode first = new LinkedListNode(1, null, null); //AssortedMethods.randomLinkedList(1000, 0, 2);
        //first = AssortedMethods.randomLinkedList(6, 0, 6);
        LinkedListNode head = first;
        LinkedListNode second = first;

        int[] list = new int[]{2,3,4};
        for (int i = 0; i < 3; i++) {
            second = new LinkedListNode(list[i]);
            first.setNext(second);
            second.setPrevious(first);
            first = second;
        }

        LinkedListNode first2 = new LinkedListNode(2, null, null); //AssortedMethods.randomLinkedList(1000, 0, 2);
        //first = AssortedMethods.randomLinkedList(6, 0, 6);
        LinkedListNode head2 = first2;
        head2.next = head.next.next;
       // LinkedListNode second2 = first2;


//        int[] list2 = new int[]{2};
//        for (int i = 0; i < 1; i++) {
//            second2 = new LinkedListNode(list2[i]);
//            first2.setNext(second2);
//            second2.setPrevious(first2);
//            first2 = second2;
//        }
//






        System.out.println(head.printForward());
        System.out.println(head2.printForward());

        LinkedListNode tail1 = iterateList(head, 1);
        LinkedListNode tail2 = iterateList(head2, 2);

        if(tail1 == tail2){
            System.out.println("tail 1 is the same as tail 2");
            LinkedListNode intersectNode = findIntersect(head, head2);
            System.out.println("intersect node is " + intersectNode.data);
        }
        else{
            System.out.println("there is no intersection");
        }





    }

    public LinkedListNode iterateList(LinkedListNode head, int listidx){
        LinkedListNode prev = head;

        while(head != null){
            if(listidx == 1){
                l1Size++;
            }
            else{
                l2Size++;
            }
            prev = head;
            head = head.next;
        }

        return prev;
    }



    public LinkedListNode findIntersect(LinkedListNode l1, LinkedListNode l2){

        int sizeDiff = Math.abs(l1Size - l2Size);
        int smallerListSize = Math.min(l1Size, l2Size);
        LinkedListNode smallList;
        LinkedListNode bigList;

        if(sizeDiff == 0){
            smallList = l1;
            bigList = l2;
        }
        else if(smallerListSize == l1Size){
            smallList = l1;
            bigList = l2;
        }
        else{
            smallList = l2;
            bigList = l1;
        }


        //iterate through bigger list
        for(int i = 0; i < sizeDiff; i++){
            bigList = bigList.next;
        }


        //lists are at the same size
        //start iterating to common element

        while(smallList.next != null && bigList != null){
            if(smallList.next == bigList.next){
                return smallList.next;
            }
            else{
                smallList = smallList.next;
                bigList = bigList.next;
            }

        }

        return null;
    }

}
