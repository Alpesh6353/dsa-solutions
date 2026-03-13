/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode* temp = head;
        int len = 0;
        while(temp != NULL){
            len++;
            temp = temp->next;
        }
        // nth from end = (len-n+1)th from start
        int m = len - n + 1 ;
        int idx = len - n; // the idx of node to be deleted
        if(idx==0){
            head = head->next;
            return head;
        }
        ListNode* t = head;
        for(int i=1;i<=idx-1;i++){
            t = t->next;
        }
        // if(idx==len-1) t->next = NULL;
        t->next = t->next->next;
        return head;
    }
};