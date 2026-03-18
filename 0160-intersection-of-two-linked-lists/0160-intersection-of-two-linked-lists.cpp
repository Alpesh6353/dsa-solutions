
class Solution {
public:
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
        ListNode* t1 = headA;
        int len1 = 0;
        while(t1 != NULL){
            len1++;
            t1 = t1->next;
        }

        ListNode* t2 = headB;
        int len2 = 0;
        while(t2 != NULL){
            len2++;
            t2 = t2->next;
        }
        ListNode* head1 = headA;
        ListNode* head2 = headB;
        int idx=0;
        if(len2>len1){
            idx = len2-len1;
            for(int i=1;i<=idx;i++){
                head2 = head2->next;
            }
        }
        else{
            idx = len1-len2;
            for(int i=1;i<=idx;i++){
                head1 = head1->next;
            }
        }
        bool flag  = false;
        while((head1 != NULL && head2 != NULL)){
            if(head1 != head2){
            head1 = head1->next;
            head2 = head2->next;
            }
            else{
                 flag = true;
                 break;
                 }
        }
        if(flag==true) return head1;
        else return NULL;
    }
};