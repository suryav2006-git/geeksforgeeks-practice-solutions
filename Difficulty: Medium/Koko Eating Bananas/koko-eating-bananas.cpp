class Solution {
  public:
    
    int maxof(vector<int> arr) {
        int n = arr.size();
        int maxi = INT_MIN ;
        
        for(int i=0; i<n ; i++) {
            if(arr[i] >= maxi) {
                maxi = arr[i];
            }
        }
        return maxi;
    }
    
    int totalhrsof(vector<int> arr, int hour) {
        int totalhrs = 0;
        int n = arr.size();
        
        for(int i=0; i<n; i++) {
            totalhrs += ceil( (double)arr[i] / hour);
        }
        return totalhrs;
    }
  
    int kokoEat(vector<int>& arr, int hours) {
        // Code here
        int low = 1;
        int high = maxof(arr);
        
        while(low <= high) {
            int mid = low + (high - low) / 2;
            int totalhrs = totalhrsof(arr, mid);
            
            if(totalhrs <= hours) {
                high = mid-1;
            }
            else low = mid+1;
        }
        return low;
        
    }
};