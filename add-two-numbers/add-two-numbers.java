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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        //declare result LL
        //declare carry variable = 0
        
        //while l1 and l2 not null
        // if l1 is null
        //.  just add l2
        //.  l2.next
        // if l2 is null
        //. just add l1
        //. l1.next
        // else
        //.  add l1 + l2 + carry
        //.  if result > 10
        //.    make carry 1
        //.    add ones to result
                
        //return result
        
        
        ListNode result = new ListNode();
        ListNode finalResult = result;
        int carry = 0;
        
        while(l1 != null || l2 != null){
            if(l1 == null){
                int tempAdd = l2.val + carry;
                l2 = l2.next;
                if(tempAdd >= 10){                    
                    tempAdd = tempAdd % 10;
                    result.next = new ListNode(tempAdd);
                    result = result.next;
                    carry = 1;
                }
                else{
                    result.next = new ListNode(tempAdd);
                    result = result.next;
                    carry = 0;
                }
            }
            
            
            else if(l2 == null){
                int tempAdd = l1.val + carry;
                l1 = l1.next;
                if(tempAdd >= 10){                    
                    tempAdd = tempAdd % 10;
                    result.next = new ListNode(tempAdd);
                    result = result.next;
                    carry = 1;
                }
                else{
                    result.next = new ListNode(tempAdd);
                    result = result.next;
                    carry = 0;
                }
            }
            
            
            else{
                int tempAdd = l1.val + l2.val + carry;
                l1 = l1.next;
                l2 = l2.next;
                if(tempAdd >= 10){                    
                    tempAdd = tempAdd % 10;
                    result.next = new ListNode(tempAdd);
                    result = result.next;
                    carry = 1;
                }
                else{
                    result.next = new ListNode(tempAdd);
                    result = result.next;
                    carry = 0;
                }
                
            }
            
            
        }
        
        if(carry == 1){
            result.next = new ListNode(1);
            // result= result.next;
        }
        
        
    return finalResult.next;    
    }
    
}

























