#User function Template for python3

def game_with_number (arr,  n) : 
    #Complete the function
    xor = []
    for i in range(n-1) :
        x = arr[i] ^ arr[i+1]
        xor.append(x)
        
    xor.append(arr[n-1])
        
    return xor