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
    public ListNode partition(ListNode head, int x) {
        if(head==null || head.next==null) return head;
        ListNode temp = head;
        ListNode dummyless = new ListNode(0);
        ListNode dummylarge = new ListNode(0);
        ListNode templ = dummyless;
        ListNode tempm = dummylarge;
        while(temp != null){
            if(temp.val < x){
                templ.next = temp;
                templ = templ.next;
            }
            else{
                tempm.next = temp;
                tempm = tempm.next;
            }
            temp = temp.next;
        }
        templ.next = dummylarge.next;
        tempm.next = null;
        return dummyless.next;
    }
}