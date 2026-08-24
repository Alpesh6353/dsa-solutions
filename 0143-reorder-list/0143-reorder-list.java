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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null ) return;
        ListNode slow = head;
        ListNode fast = head;
        ListNode head2 = null; //head form middle linked list 
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        head2 = slow.next;
        slow.next= null;
        ListNode temp = head2;
        ListNode prev = null;
        head2 = head2.next;
        while(temp != null){
            temp.next = prev;
            prev = temp;
            temp = head2;
            if(head2 != null) head2 = head2.next;
        } 
        head2 = prev;
        temp = head2;
        slow = head;
        ListNode Dummy = new ListNode(0);
        ListNode res = Dummy;
        while(slow != null && temp != null){
            res.next = slow;
            res = res.next;
            slow = slow.next;
            res.next = temp;
            res = res.next;
            temp = temp.next;
        }
        if(slow != null ) res.next = slow;
        if(temp != null ) res.next = temp;
        head = Dummy.next;
    }
}