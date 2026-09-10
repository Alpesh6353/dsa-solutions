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
    public ListNode removeNodes(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ListNode temp = head;
        st.push(temp.val);
        temp = temp.next;
        while(temp != null){
            while(st.size()>=1 && temp.val>st.peek()){
                st.pop();
            }
            st.push(temp.val);
            temp = temp.next;
        }
        Stack<Integer> st2 = new Stack<>();
        while(!st.isEmpty()) st2.push(st.pop());
        ListNode dummy = new ListNode(0);
        temp = dummy;
        while(!st2.isEmpty()){
            ListNode new_node = new ListNode(st2.pop());
            temp.next = new_node;
            temp = temp.next;
        }
        return dummy.next;
    }
}