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
        while(temp1 != null || temp2 != null){
            int d1 = temp1 != null ? temp1.val : 0;
            int d2 = temp2 != null ? temp2.val : 0;
            carry += (d1+d2);
            if(carry==10){
                ListNode new_node = new ListNode(carry%10);
                temp3.next = new_node;
                carry = 1;
            }
            else{
                ListNode new_node = new ListNode(carry%10);
                temp3.next = new_node;
                carry /= 10;
            }
            if(temp1 != null) temp1 = temp1.next;
            if(temp2 != null) temp2 = temp2.next;
            temp3 = temp3.next;
        }
        if(carry != 0){
            ListNode new_node = new ListNode(carry%10);
            temp3.next = new_node;
            temp3 = temp3.next;
        }
        return reverse(dummy.next);
    }
}