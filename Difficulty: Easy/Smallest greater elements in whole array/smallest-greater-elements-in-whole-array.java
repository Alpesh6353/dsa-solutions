// User function Template for Java

// User function Template for Java

// User function Template for Java

class Complete {

    // Function for finding maximum and value pair
    public static int[] greaterElement(int arr[], int n) {
        // Complete the function
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[i] = arr[i];
        }
        Arrays.sort(ans);
        for(int i=0;i<n;i++){
            int lo = 0;
            int hi = n-1;
            while(lo<=hi){
                int mid = lo + (hi-lo)/2;
                if(ans[mid]==arr[i]){
                    if(mid==n-1){
                        arr[i] = -10000000;
                        break;
                    }
                    else if(ans[mid]==ans[mid+1]) lo = mid+1;
                    else{
                        arr[i] = ans[mid+1];
                        break;
                    }
                }
                if(ans[mid]>arr[i]) hi = mid-1;
                else lo = mid+1;
            }
        }
        return arr;
    }
}
