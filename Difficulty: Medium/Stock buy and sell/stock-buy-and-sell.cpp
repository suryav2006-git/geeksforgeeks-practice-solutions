class Solution {
  public:
    int stockBuySell(vector<int> &arr) {
        // code here
        int n = arr.size();
        
        int maxprofit;
        
        for(int i=1; i<n ; i++) {
            int current = arr[i];
            int before = arr[i-1];
            
            if(current > before) {
                maxprofit += (current - before );
            }
        }
        return maxprofit;
    }
};