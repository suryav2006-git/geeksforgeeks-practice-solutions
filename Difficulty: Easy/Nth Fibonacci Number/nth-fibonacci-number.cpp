class Solution {
  public:
    int nthFibonacci(int n) {
        // code here
        if(n <= 1) return n;
        
        int first = 0;
        int second = 1;
        
        int count = 0;
        
        for(int i=2 ; i<=n ; i++) {
            count= first + second;
            
            first = second;
            second = count;
        }
        
        return count;
    }
};