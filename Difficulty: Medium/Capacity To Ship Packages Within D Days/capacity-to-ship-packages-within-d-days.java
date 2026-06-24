class Solution {
    
    public int sumof(ArrayList<Integer> nums) {
        int n = nums.size();
        int sum = 0;
        
        for(int i=0; i<n ; i++  ) {
            sum += nums.get(i);
        }
        return sum;
    }
    
    public int maxof(ArrayList<Integer> nums) {
        int n = nums.size();
        int maxi = Integer.MIN_VALUE ;
        
        for(int i=0; i<n ; i++) {
            if(nums.get(i) > maxi) maxi = nums.get(i);
        }
        return maxi;
    }
    
    public int daysRequired(ArrayList<Integer> weights, int capacity) {
        int days = 1;
        int load = 0;
        int n = weights.size();
        
        for(int i=0; i<n ; i++) {
            if( load + weights.get(i) > capacity ) {
                days = days + 1;
                load = weights.get(i);
            }
            else load += weights.get(i);
        }
        return days;
    }
    
    public int leastWeightCapacity(ArrayList<Integer> weights, int maxdays) {
        // code here
        int low = maxof(weights);
        int high = sumof(weights);
        
        while(low <= high) {
            int mid = low + (high - low) / 2;
            int daysreq = daysRequired(weights, mid);
            
            if( daysreq <= maxdays ) {
                high = mid -1;
            }
            else low = mid+1;
        }
        
        return low;
        
    }
}



