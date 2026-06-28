class Solution {
    int KthMissingElement(int arr[], int k) {
        // Complete the function
        int n = arr.length;
        
        int totalMissing = arr[n - 1] - arr[0] - (n - 1);
        
        if (k > totalMissing) {
            return -1;
        }
        
        int low = 0;
        int high = n - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            int missing = (arr[mid] - arr[0]) - mid;
            
            if (missing < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return arr[0] + high + k;
    }
}
