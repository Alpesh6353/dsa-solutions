/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode l1 = headA;
        ListNode l2 = headB;
        int count1=0;
        int count2=0;
        while(l1 != null || l2 != null){
            if(l1 != null){
                count1++;
                l1 = l1.next;
            }
            if(l2 != null){
                count2++;
                l2 = l2.next;
            }
        }
        l1 = headA;
        l2 = headB;
        if(count2>count1){
            int k = count2-count1;
            for(int i=1;i<=k;i++){
                l2 = l2.next;
            }
        }
        if(count1>count2){
            int k = count1-count2;
            for(int i=1;i<=k;i++){
                l1 = l1.next;
            }
        }
        while(l2 != null && l1 != null){
            if(l1==l2) return l1;
            l1 = l1.next;
            l2 = l2.next;
        }
        return null;
    }
}