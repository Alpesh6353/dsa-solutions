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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        ListNode temp = slow;
        prev = null;
        slow = slow.next;
        while(temp != null){
            temp.next = prev;
            prev = temp;
            temp = slow;
            if(slow != null) slow = slow.next;
        }
        slow = prev; 
        temp = head;
        ListNode temp2 = slow;
        while(temp != null && temp2 != null){
            if(temp.val == temp2.val){
                temp = temp.next;
                temp2 = temp2.next;
            }
            else return false;
        }
        return true;
    }
}