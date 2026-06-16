class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int n = people.length;
        int count = 0;
        int i=0;
        int j=n-1;
        while(j>=i){
            if(people[i]+people[j]==limit){
                count++;
                i++;
                j--;
            }
            else if(people[i]+people[j]>=limit){
                if(people[i]>people[j]) i++;
                else j--;
                count++;
            }
            else {
                i++;
                j--;
                count++;
                }
        }
        return count;
    }
}