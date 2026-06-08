class Solution {
    static boolean armstrongNumber(int n) {
        int h = n / 100;          
        int t = (n / 10) % 10;        
        int o = n % 10;               
        
        int sumOfCubes = (h * h * h) + 
                         (t * t * t) + 
                         (o * o * o);
                         
        return sumOfCubes == n;
    }
}
