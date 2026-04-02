def pair_sum(arr, sum):
    # code here
    

    n = len(arr)
    
    for i in range(0,n-1) :
        for j in range(i+1,n) :
            if (arr[i] + arr[j] == sum) :
                return True
                
    return False