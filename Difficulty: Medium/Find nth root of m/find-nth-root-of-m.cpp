class Solution {
  public:
  
    int func(int mid , int n, int numb) {
        long answer = 1;
        
        for(int i=1; i<=n ; i++) {
            answer = answer*mid;
            
            if(answer > numb) return 2;
        }
        if(answer == numb) return 1;
        return 0;
    }
  
    int nthRoot(int nth, int numb) {
        // Code here
        if(numb==0) return 0;
        
        int low =1;
        int high = numb;
        
        while(low <= high) {
            int mid = low + (high - low) / 2;
            int midnum = func(mid, nth, numb);
            
            if(midnum == 1) return mid;
            
            else if (midnum == 0) low = mid + 1;
            else high = mid -1;
        }
        return -1;
    }
};