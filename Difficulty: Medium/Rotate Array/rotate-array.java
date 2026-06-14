class Solution {
    
    public void rotate(int nums[], int start, int end) {
        while(start<=end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++ ;
            end-- ;
        }
    }
    
    void rotateArr(int nums[], int d) {
        // code here
        int n = nums.length;
        d = d % n;
        
        rotate(nums, 0, d-1);
        rotate(nums, d, n-1);
        rotate(nums, 0, n-1);
        
        return;
        
    }
}