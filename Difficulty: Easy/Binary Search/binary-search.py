class Solution:
    def binarysearch(self, arr, k):
        l = 0
        r = len(arr) - 1
        result = -1
        
        while l <= r:
            m = (l + r) // 2
            if arr[m] == k:
                result = m        
                r = m - 1        
            elif arr[m] < k:
                l = m + 1
            else:
                r = m - 1
                
        return result
