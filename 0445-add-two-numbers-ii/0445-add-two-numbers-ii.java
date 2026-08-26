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
        ListNode h1 = l1;
        ListNode h2 = l2;
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode dummy  = new ListNode(0);
        ListNode temp3 = dummy;
        int carry = 0;
        ListNode prev = null;
        h1 = h1.next;
        while(temp1 != null){
            temp1.next = prev;
            prev = temp1;
            temp1 = h1;
            if(h1 != null) h1 = h1.next;
        }
        h1 = prev;
        prev = null;

        h2 = h2.next;
        while(temp2 != null){
            temp2.next = prev;
            prev = temp2;
            temp2 = h2;
            if(h2 != null) h2 = h2.next;
        }
        h2 = prev;
        temp1 = h1;
        temp2 = h2;
        while(temp1 != null && temp2 != null){
            carry += temp1.val;
            carry += temp2.val;
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
            temp1 = temp1.next;
            temp2 = temp2.next;
            temp3 = temp3.next;
        }
        if(temp1 == null && temp2 != null){
            while(temp2 != null){
                 carry += temp2.val;
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
                temp2 = temp2.next;
                temp3 = temp3.next;
            }
        }

        if(temp2 == null && temp1 != null){
            while(temp1 != null){
                 carry += temp1.val;
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
                temp1 = temp1.next;
                temp3 = temp3.next;
            }
        }
        if(carry != 0){
            ListNode new_node = new ListNode(carry%10);
            temp3.next = new_node;
            temp3 = temp3.next;
        }
        temp3 = dummy.next;
        prev = null;
        dummy = dummy.next.next;
        while(temp3 != null){
            temp3.next = prev;
            prev = temp3;
            temp3 = dummy;
            if(dummy != null) dummy = dummy.next;
        }
        dummy = prev;
        return dummy;
    }
}