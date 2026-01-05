class Solution {
public:
    int findKthPositive(vector<int>& arr, int k) {
        int i = 0;      // Array pointer
        int a = 1;      // Current positive integer starting from 1
        int m = 0;      // Missing number counter

        // Continue until we find the k-th missing number
        while (m < k) {
            // If current number 'a' is in the array, move the array pointer
            if (i < arr.size() && arr[i] == a) {
                i++;
            } else {
                // 'a' is missing, increment missing counter
                m++;
                // If this was the k-th missing number, return it
                if (m == k) return a;
            }
            a++; // Move to the next positive integer
        }
        return -1; // Should not reach here
    }
};
