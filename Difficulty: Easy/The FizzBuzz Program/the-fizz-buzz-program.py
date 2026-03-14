#User function Template for python3

def fizzBuzz(number):
    # Write your code here.
    
    num = number 
    
    if ((num%3==0) and (num%5==0)) :
        print ("FizzBuzz")
    
    elif ( num%3 ==0 and (num%5 !=0)):
        print("Fizz")
        
    elif ((num%3!=0) and (num%5 ==0)) :
        print("Buzz")
        
    else : print(number)