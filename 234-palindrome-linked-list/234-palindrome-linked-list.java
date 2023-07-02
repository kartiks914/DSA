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
    public ListNode midNode(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null )
            return true;
        // finding the mid of the Linked List
        
        ListNode mid=midNode(head);
        
        //reverse the left side and compare with the right
        ListNode curr=mid;
        ListNode prev=null;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        
        
        //compare the right and Left
        ListNode right=prev;
        ListNode left=head;
        while(right!=null){
            if(right.val != left.val)
                return false;
           
                right=right.next;
                left=left.next;
        }
        return true;  
    }
}