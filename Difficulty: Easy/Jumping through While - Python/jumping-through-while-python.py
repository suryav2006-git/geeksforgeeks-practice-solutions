def printIncreasingPower(x):
    #code here
    # Loop to jump in powers of 2
    
    
    i =1
    while (i<x):
        
        squ = i * i
        i+=1
        if (squ > x):
            return
        
        print(squ , end = " ")
        #code here