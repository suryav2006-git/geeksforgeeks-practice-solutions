class Solution:
    def checkStatus(self, a, b, flag):
        # code here
        self.a = a
        self.b =b
        
        if a>0 and b>0 :
            return False

        else :
            if flag == False :
                if a > 0 or b>0 :
                    return True
            
            elif flag == True :
                if ( a<0 and b<0) :
                    return True