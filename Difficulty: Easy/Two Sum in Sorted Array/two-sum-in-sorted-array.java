class Solution {
    public ArrayList<Integer> twoSum(int[] arr, int target) {
        // code here
        int n = arr.length;
        
        int low = 0;
        int high = n-1;
        
        ArrayList<Integer> list = new ArrayList<>();
        
        while(low < high) {
            int actual = arr[low] + arr[high];
            
            if(actual == target) {
                list.add(low+1);
                list.add(high+1);
                
                return list;
            }
            else if(actual > target) high-- ;
            else low++ ;
        }
        list.add(-1);
        list.add(-1);
        
        return list;
    }
}