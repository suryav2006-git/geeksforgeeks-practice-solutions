class Solution:
    def getMinMax(self, arr):
        # code here
        n = len(arr)
        min = arr[0]
        max = arr[0]
        
        for i in range(n) :
            if (arr[i] > max ):
                max = arr[i]
            if (arr[i] < min ) :
                min = arr[i]
                
        return [min,max]