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
        ListNode dummyo = new ListNode(0);
        ListNode even = dummye;
        ListNode odd = dummyo;
        int count = 1;
        while(temp != null){
            if(count%2==0){
                even.next = temp;
                even = even.next;
            }
            else {
                odd.next = temp;
                odd = odd.next;
            }
            count++;
            temp = temp.next;
        }
        odd.next = null;
        even.next = null;
        dummye = dummye.next;
        dummyo = dummyo.next;
        odd.next = dummye;
        return dummyo;
    }
}