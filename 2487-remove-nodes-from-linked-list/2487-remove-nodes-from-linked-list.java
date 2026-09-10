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
        
        ListNode dummy = new ListNode(st.peek());
        temp = dummy;
        st.pop();
        while(!st.isEmpty()){
            ListNode new_node = new ListNode(st.pop());
            new_node.next = temp;
            temp = new_node;
        }
        return temp;
    }
}