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
    public ListNode reverse(ListNode head){
        ListNode temp = head;
        ListNode prev = null;
        head = head.next;
        while(temp != null){
            temp.next = prev;
            prev = temp;
            temp = head;
            if(head != null) head = head.next;
        }
        head = prev;
        return head;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode h1 = reverse(l1);
        ListNode h2 = reverse(l2);
        ListNode temp1 = h1;
        ListNode temp2 = h2;
        ListNode dummy  = new ListNode(0);
        ListNode temp3 = dummy;
        int carry = 0;
        while(temp1 != null || temp2 != null || carry == 1){
            int d1 = temp1 != null ? temp1.val : 0;
            int d2 = temp2 != null ? temp2.val : 0;
            int d = carry + d1+d2 ;
            carry = d/10;
            d = d%10;
            ListNode new_node = new ListNode(d);
            temp3.next = new_node;
            if(temp1 != null) temp1 = temp1.next;
            if(temp2 != null) temp2 = temp2.next;
            temp3 = temp3.next;
        }
        return reverse(dummy.next);
    }
}