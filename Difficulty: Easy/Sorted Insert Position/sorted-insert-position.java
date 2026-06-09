class Solution {
    public int searchInsertK(int nums[], int k) {
        // code here
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int index = n;
        
        while(low<=high) {
            int mid = (low + high) / 2;
            if(nums[mid] >= k) {
                index = mid;
                high = mid -1;
            }
            else low = mid + 1;
        }
        return index;
    }
};