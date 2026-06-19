class Solution {
    
    public int maxof(int[] arr) {
        int n = arr.length;
        int maxi = Integer.MIN_VALUE ;
        
        for(int i=0; i<n ; i++) {
            if(arr[i] >= maxi) {
                maxi = arr[i];
            }
        }
        return maxi;
    }
    
    public int totalhrsof(int[] arr, int hour) {
        int totalhrs = 0;
        int n =arr.length;
        
        for(int i=0; i<n ; i++) {
            totalhrs += Math.ceil((double) arr[i] / hour) ;
        }
        return totalhrs;
    }
    
    public int kokoEat(int[] arr, int hours) {
        // code here
        int low = 1;
        int high = maxof(arr);
        
        while(low <= high) {
            int mid = low + (high - low) / 2;
            int totalhrs = totalhrsof(arr,mid);
            
            if(totalhrs <= hours) {
                high = mid -1;
            }
            else low = mid+1;
        }
        return low;
    }
}
