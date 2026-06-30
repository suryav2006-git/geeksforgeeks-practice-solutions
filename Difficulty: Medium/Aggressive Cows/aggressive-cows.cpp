class Solution {
  public:
  
    int canweplace(vector<int> &stalls, int distance, int cows) {
        int cowcount = 1;
        int last = stalls[0];
        int n = stalls.size();
        
        for(int i=0; i<n; i++ ) {
            if( stalls[i] - last >= distance ) {
                cowcount++ ;
                last = stalls[i];
            }
            if(cowcount >= cows) return true;
        }
        return false;
    }
  
    int aggressiveCows(vector<int> &stalls, int cows) {
        // code here
        int n = stalls.size();
        
        sort(stalls.begin(), stalls.end());
        
        int low = 1;
        int high = stalls[n-1] - stalls[0];
        
        while(low <= high) {
            int mid = low + (high - low) / 2;
            
            if( canweplace(stalls,mid, cows ) == true) {
                low = mid+1;
            }
            else high = mid-1;
        }
        return high;
    }
};