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
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        int x = 0;
        x = temp1.val + temp2.val;
        ListNode head = new ListNode(x%10);
        ListNode temp3 = head;
        temp1 = temp1.next;
        temp2 = temp2.next;
        x /= 10;
        while(temp1 != null && temp2 != null){
            x += temp1.val + temp2.val;
            ListNode new_node = new ListNode(x%10);
            temp3.next = new_node;
            temp3 = temp3.next;
            x /= 10;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        if(temp1 == null){
            while(temp2 != null){
            x += temp2.val;
            ListNode new_node = new ListNode(x%10);
            temp3.next = new_node;
            temp3 = temp3.next;
            temp2 = temp2.next;
            x /= 10;
            }
        }
        if(temp2 == null){
            while(temp1 != null){
            x += temp1.val;
            ListNode new_node = new ListNode(x%10);
            temp3.next = new_node;
            temp3 = temp3.next;
            temp1 = temp1.next;
            x /= 10;
            }
        }
        if(x != 0){
            ListNode new_node = new ListNode(x%10);
            temp3.next = new_node;
            temp3 = temp3.next;
            x /= 10;
        }
        return head;
    }
}