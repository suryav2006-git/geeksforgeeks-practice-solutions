class Solution {
  public:
    int KthMissingElement(vector<int> &arr, int &k) {
        // Complete the function
        int n = arr.size();
        
        int totalmiss = arr[n-1] - arr[0] - (n-1);
        
        if(k > totalmiss) return -1;
        
        int low = 0;
        int high = n-1;
        
        while(low<= high) {
            int mid = low + (high - low) / 2;
            
            int missing = arr[mid] - mid - arr[0];
            
            if(missing < k ) low = mid+1;
            else high = mid-1;
        }
        int kth = high + k + arr[0];
        return kth;
    }
};