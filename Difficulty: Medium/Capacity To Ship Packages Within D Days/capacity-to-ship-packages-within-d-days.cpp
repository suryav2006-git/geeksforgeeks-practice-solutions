class Solution {
  public:
    int daysRequired(vector<int>& weight, int capacity) {
        int load = 0;
        int days = 1;
        int n = weight.size();
        
        for(int i=0; i<n; i++) {
            if(load + weight[i] > capacity) {
                days = days + 1;
                load = weight[i];
            }
            else load += weight[i];
        }
        return days;
    }
  
    int sumof(vector<int> &nums) {
        int n = nums.size();
        int sum =0;
        for(int i=0; i<n ; i++) {
            sum += nums[i];
        }
        
        return sum;
    }
    
    int maxof(vector<int>& nums) {
        int n = nums.size();
        int maxi = INT_MIN ;
        
        for(int i=0; i<n; i++) {
            if(nums[i] > maxi) maxi = nums[i];
        }
        return maxi;
    }
    
    int leastWeightCapacity(vector<int>& weights, int days) {
        // code here
        int low = maxof(weights);
        int high = sumof(weights);
        
        while(low<=high) {
            int mid = low + (high - low) / 2;
            int daysreq = daysRequired(weights, mid);
            
            if(daysreq <= days) {
                high = mid-1;
            }
            else low = mid+1;
        }
        return low;
    }
};




