def reverseString(s):
    #code here
    
    reversed = ""
    
    for i in s:
        reversed = i + reversed
        
    return reversed
