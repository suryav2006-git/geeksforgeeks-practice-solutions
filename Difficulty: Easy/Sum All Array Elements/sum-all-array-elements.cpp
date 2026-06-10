class Solution {
  public:
    int arraySum(vector<int>& nums) {
        // code here
        int n = nums.size();
        int sum = 0;
        for(int i=0; i<n ; i++) {
            sum += nums[i];
        }
        return sum;
    }
};