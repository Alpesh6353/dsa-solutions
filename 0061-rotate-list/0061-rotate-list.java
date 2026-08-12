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
    public ListNode rotateRight(ListNode head, int k) {
        if(k==0 || head==null || head.next == null) return head;
        ListNode slow = head;
        ListNode fast = head;
        int count = 0;
        while(fast != null){
            fast = fast.next;
            count++;
        }
        if(k==count) return head;
        if(k>count) k = k%count;
        fast = head;
        for(int i=1;i<=k;i++){
            fast = fast.next;
        }
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = head;
        ListNode a = slow.next;
        slow.next = null;
        head = a;
        return head;
    }
}