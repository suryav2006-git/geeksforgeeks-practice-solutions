class Solution {
    public int findKRotation(int nums[]) {
        // Code here
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int mini = Integer.MAX_VALUE ;
        int index = -1;
        
        while(low<=high) {
            int mid = low + (high-low)/2 ;
            
            if(nums[low] <= nums[high] ) {
                if(nums[low] <= mini) {
                    index = low;
                }
                break;
            }
            
            if(nums[low] <= nums[mid]) {
                if(nums[low] <= mini) {
                    mini = nums[low];
                    index = low;
                }
                low = mid + 1;
            }
            else {
                if(nums[mid] <= mini) {
                    mini = nums[mid];
                    index = mid;
                }
                high = mid-1;
            }
            
        }
        
        return index;
    }
}