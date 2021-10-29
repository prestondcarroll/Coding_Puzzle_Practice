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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        //declare return list empty
        //while l1 & l2 != null
        //. take lesser of l1 and l2
        //. set next of return list to lesser
        //. set current to next of return list
        //. move either forward one
        
        //return return list
        if(l1 == null && l2 == null){
            return null;
        } 
        
        ListNode returnList;
        
        if(l1 == null && l2 != null){
            returnList = new ListNode(l2.val);
            l2 = l2.next;
        }
        else if(l2 == null && l1 != null){
            returnList = new ListNode(l1.val);
            l1 = l1.next;
        }
        else{
            if(l1.val <= l2.val){
                returnList = new ListNode(l1.val);
                l1 = l1.next;
            }
            else{
                returnList = new ListNode(l2.val);
                l2 = l2.next;
            }
            
        }
        
        
        ListNode returnListHead = returnList;
        
        
        
        while(l1 != null || l2 != null){
            // int l1Num;
            // int l2Num;
            // if(l1 != null){
            //     l1Num = l1.val;
            // }            
            // if(l2 != null){
            //     l2Num = l2.val;
            // }
            
            if(l1 != null && l2 == null){
                returnList.next = new ListNode(l1.val);
                returnList = returnList.next;
                l1 = l1.next;
            }
            else if(l2 != null && l1 == null){
                returnList.next = new ListNode(l2.val);
                returnList = returnList.next;
                l2 = l2.next;
            }
            else{
               if(l1.val <= l2.val){
                    returnList.next = new ListNode(l1.val);
                    returnList = returnList.next;
                    l1 = l1.next;
                }
                else{
                    returnList.next = new ListNode(l2.val);
                    returnList = returnList.next;
                    l2 = l2.next;
                } 
            }                        
        }
        
        return returnListHead;
        
        
        
    }
}