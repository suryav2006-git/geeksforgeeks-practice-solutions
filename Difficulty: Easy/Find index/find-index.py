#User function Template for python3

arr = tuple(map(int, input().split()))
x = int(input())

array = list(arr)
########### Write your code below ###############
# Print the index of x in arr
if (len(array)==1):
    print("0")


else :
    for i in range (0, len(array)) :
        if array[i] == x :
            print(i)    

########### Write your code above ###############

        