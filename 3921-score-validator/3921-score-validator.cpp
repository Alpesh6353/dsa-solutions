class Solution {
public:
    vector<int> scoreValidator(vector<string>& events) {
        int n = events.size();
        int x = 0;  //score
        int y = 0;  //count
        for(int i=0;i<n;i++){
            if(events[i]=="W") y++;
            else if(events[i]=="WD" || events[i]=="NB") x++;
            else {
                string s = events[i];
                int a = stoi(s);
                x = x+a;

            }
            if(y==10) break;
        }
        vector<int> v(2);
        v[0] = x;
        v[1] = y;
        return v;
    }
};