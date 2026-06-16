class Solution {
  public:
    
    int minof(int a, int b) {
        if(a<=b) return a;
        else return b;
    }
    
    int findMin(vector<int>& nums) {
        // code here
        int n = nums.size();
        int low = 0;
        int high = n-1;
        
        int ans = INT_MAX ;
        
        while( low <= high) {
            int mid = low + (high - low ) / 2;
            
            if(nums[low] <= nums[mid]) {
                ans = minof(ans,nums[low]);
                low = mid+1;
            }
            else {
                ans = minof(nums[mid],ans);
                high = mid-1;
            }
        }
        return ans;
    }
};