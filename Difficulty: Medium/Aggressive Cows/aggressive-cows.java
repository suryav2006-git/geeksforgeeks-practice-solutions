class Solution {
    
    public boolean canweplace(int[] stalls, int dist, int cows) {
        int cowcount = 1;
        int n=stalls.length;
        int last = stalls[0];
        
        for(int i=0; i<n ; i++) {
            if( stalls[i] - last >= dist) {
                cowcount++ ;
                last = stalls[i];
            }
            if(cowcount >= cows) return true;
        }
        return false;
    }
    
    public int aggressiveCows(int[] stalls, int cows) {
        // code here
        int n = stalls.length;
        Arrays.sort(stalls);
        
        int low = 1;
        int high = stalls[n-1] - stalls[0];
        
        while(low<=high) {
            int mid = low + (high - low) / 2;
            
            if(canweplace(stalls, mid, cows) == true) {
                low = mid+1;
            }
            else high = mid-1;
        }
        return high;
        
    }
}