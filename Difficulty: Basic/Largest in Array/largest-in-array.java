class Solution {
    public static int largest(int[] nums) {
        // code here
        int n = nums.length;
        
        if (n==1) return nums[0];
        
        int maxi = nums[0];
        
        for(int i =0; i<n ; i++) {
            if(nums[i] > maxi) {
                maxi = nums[i];
            }
        }
        
        return maxi;
    }
}
