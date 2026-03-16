class Solution:
    def bubbleSort(self,arr):
        # code here
        n = len(arr)
        
        for i in range(n):
            for j in range(0,n-1-i) : 
                if arr[j] > arr[j+1] :
                    temp = arr[j]
                    arr[j] = arr[j+1]
                    arr[j+1] = temp
                    
        return arr