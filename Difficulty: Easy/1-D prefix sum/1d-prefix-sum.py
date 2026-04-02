class Solution:
    def prefSum(self, arr):
        n = len(arr)
        if n == 0: return []
        newarr = [0] * n
        newarr[0] = arr[0]
        for i in range(1, n):
            newarr[i] = newarr[i-1] + arr[i]    
        return newarr
