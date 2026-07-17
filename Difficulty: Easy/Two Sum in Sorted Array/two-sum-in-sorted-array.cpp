class Solution {
  public:
    vector<int> twoSum(vector<int>& arr, int target) {
        // code here
        int n = arr.size();
        
        int low = 0;
        int high = n-1;
        
        vector<int> pair;
        
        while(low <= high) {
            
            int actual = arr[low] + arr[high];
            
            if( actual == target ) {
                pair.push_back(low+1);
                pair.push_back(high+1) ;
                
                return pair;
            }
            
            else if(actual > target) {
                high-- ;
            }
            else low++ ;
        }
        pair.push_back(-1);
        pair.push_back(-1);
        
        return pair;
    }
};