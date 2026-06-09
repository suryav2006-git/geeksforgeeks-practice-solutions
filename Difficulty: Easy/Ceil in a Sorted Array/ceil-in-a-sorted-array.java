// User function Template for Java
class Solution {
    public int findCeil(int[] nums, int x) {
        // code here
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int index = -1 ;
        
        while(low<=high) {
            int mid = (low+high) / 2;
            if(nums[mid] >= x ) {
                index = mid;
                high = mid-1 ;
            }
            else low = mid+1;
        }
        return index;
    }
}
