class Solution {
public:
    vector<int> findErrorNums(vector<int>& arr) {
        int n = arr.size();
        int i=0;
        vector<int> v;
        while(i<n){
            int  ci = arr[i]-1;
            if(arr[i]==arr[ci]) i++;
            else swap(arr[i],arr[ci]);
        }
        for(int i=0;i<n;i++){
            if(arr[i]!=i+1){
                v.push_back(arr[i]);
                v.push_back(i+1);
                break;
            }
        }
        return v;
    }
};