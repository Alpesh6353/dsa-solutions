class Solution {
    void selectionSort(int[] arr) {
        // code here
        int n = arr.length;
        for(int i=0;i<n;i++){
           int min = i;
           for(int j=i+1;j<n;j++){
               if(arr[min]>arr[j]) min = j;
           }
           int temp = arr[i];
           arr[i] = arr[min];
           arr[min] = temp;
       }
    }
}