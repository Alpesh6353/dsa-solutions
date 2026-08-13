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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode temp = head;
        ListNode dummye = new ListNode(0);
        ListNode temp2 = null;
        ListNode even = dummye;
        while(temp != null && temp.next != null){
           even.next = temp.next;
           even = even.next;
           temp.next = temp.next.next;
           temp2 = temp;
           temp = temp.next;
        }
        even.next = null;
        dummye = dummye.next;
        if(temp != null) temp.next = dummye;
        else temp2.next = dummye;
        return head;
    }
}