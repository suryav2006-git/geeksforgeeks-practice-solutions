class Solution {
    public int findKRotation(int nums[]) {
        // Code here
        int n = nums.length;
        int low = 0;
        int high = n-1;
        
        while(low<=high) {
            if(nums[low] <= nums[high]) {
                return low;
            }
            
            int mid = low + (high - low) / 2;
            
            if(nums[low] <= nums[mid]) {
                low = mid+1;
            }
            else high = mid;
        }
        return 0;
    }
}