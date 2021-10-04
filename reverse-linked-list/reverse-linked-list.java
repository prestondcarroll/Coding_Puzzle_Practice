/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        
        //declare Stack
        //for each node
        //  put node in stack
        
        //take first node from stack
        //while stack is not empty
        //. node .next = stack.pop
        
        //return first Node
        if(head == null){
            return null;
        }
        
        Stack<ListNode> nodes = new Stack<>();
        ListNode cur = head;
        nodes.push(cur);
        while(cur != null){
             if(cur.next != null){
                 nodes.push(cur.next);
             }
            cur = cur.next;          
        }
        
        ListNode returnNode = nodes.pop();
        ListNode headTemp = returnNode;
        while(nodes.size() != 0){
            headTemp.next = nodes.pop();
            headTemp = headTemp.next;
        }
        headTemp.next = null;
        
        return returnNode;
        
        
    }
}