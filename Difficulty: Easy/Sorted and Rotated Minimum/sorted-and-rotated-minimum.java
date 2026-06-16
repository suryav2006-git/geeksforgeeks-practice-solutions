class Solution {
    
    public int minimumof(int a, int b) {
        if(a<=b) return a;
        else return b;
    }
    
    public int findMin(int[] nums) {
        // code here
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int minimum = Integer.MAX_VALUE ;
        
        while(low<=high) {
            int mid = low + (high - low) / 2;
            
            if(nums[low] <= nums[mid]) {
                minimum = minimumof(minimum,nums[low]);
                low = mid+1;
            }
            else {
                minimum =  minimumof(minimum, nums[mid]) ;
                high = mid-1;
            }
        }
        return minimum;
    }
}
