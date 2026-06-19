class Solution {
    int floorSqrt(int n) {
        // code here
        long low = 1;
        long high = n;
        
        while(low<=high) {
            long mid = low + (high - low) / 2;
            long answer = mid * mid;
            
            if(answer <= n) {
                low = mid+1;
            }
            else high = mid-1;
        }
        return (int)high;
    }
}