class Solution {
    int stockBuySell(int arr[]) {
        // code here
        int n = arr.length;
        
        int maxprice = 0;
        
        for(int i=1; i<n ; i++) {
            int current = arr[i];
            int before = arr[i-1];
            
            if(current > before) {
                maxprice += (current - before);
            }
        } 
        return maxprice;
    }
}
