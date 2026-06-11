class Solution {
    
    public int FirstSearch(int nums[], int n, int target) {
        int first = -1;
        int low = 0;
        int high = n-1 ;
        
        while(low<=high) {
            int mid = low + (high - low) / 2;
            if(nums[mid] == target) {
                first = mid;
                high = mid - 1;
            }
            else if (nums[mid] >= target) {
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return first;
    }
    
    public int SecondSearch(int nums[], int n, int target) {
        int second = -1;
        int low = 0;
        int high = n-1;
        
        while(low <= high){
            int mid = low + (high - low) / 2;
            
            if(nums[mid] == target) {
                second = mid;
                low = mid + 1;
            }
            else if (nums[mid] > target) {
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return second;
    }
    
    ArrayList<Integer> find(int nums[], int target) {
        // code here
        int n = nums.length;
        int first = -1;
        int second = -1;
        
        first = FirstSearch(nums, n, target);
        second = SecondSearch(nums, n, target);
        
        ArrayList<Integer> index = new ArrayList<>();
        index.add(first);
        index.add(second);
        
        return index;
    }
}
