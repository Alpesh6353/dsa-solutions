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
    vector<vector<int>> spiralMatrix(int m, int n, ListNode* head) {
        vector<vector<int>> v(m,vector<int>(n,-1));
        ListNode* temp = head;
        int minr = 0;
        int minc = 0;
        int maxr = m-1;
        int maxc = n-1;
        while(maxr>=minr && maxc>=minc){
            for(int i=minc;i<=maxc;i++){
                v[minr][i] = temp->val;
                temp = temp->next;
                if(temp == NULL) break;
            }
            minr++;
            if(minr > maxr || minc > maxc || temp == NULL) break;
            for(int i=minr;i<=maxr;i++){
                v[i][maxc] = temp->val;
                temp = temp->next;
                if(temp == NULL) break;
            }
            maxc--;
            if(minr > maxr || minc > maxc || temp == NULL) break;
            for(int i=maxc;i>=minc;i--){
                v[maxr][i] = temp->val;
                temp = temp->next;
                if(temp == NULL) break;
            }
            maxr--;
            if(minr > maxr || minc > maxc || temp == NULL) break;
            for(int i=maxr;i>=minr;i--){
                v[i][minc] = temp->val;
                temp = temp->next;
                if(temp == NULL) break;
            }
            minc++;
            if(minr > maxr || minc > maxc || temp == NULL) break;
        }
        return v;
    }
};