class Solution {
  public:
    double medianOf2(vector<int>& a, vector<int>& b) {
        // code here
        int n1 = a.size();
        int n2 = b.size();
        int i=0;
        int j=0;
        
        int count = 0;
        
        int n = n1 + n2;
        
        int ind2 = n/2;
        int ind1 = ind2 -1 ;
        
        int ele1 = -1 ;
        int ele2 = -1;
        
        while( i<n1 && j<n2) {
            if(a[i] < b[j]) {
                if(count == ind1) ele1 = a[i];
                if(count == ind2) ele2 = a[i];
                count++;
                i++;
            }
            else {
                if(count == ind1) ele1 = b[j];
                if(count == ind2) ele2 = b[j];
                count++;
                j++;
            }
        }
        while(i<n1) {
            if(count == ind1) ele1 = a[i];
            if(count == ind2) ele2 = a[i];
            count++ ;
            i++ ;
        }
        while(j<n2) {
            if(count == ind1) ele1 = b[j];
            if(count == ind2) ele2 = b[j];
            count++ ;
            j++;
        }
        
        if(n%2 == 1) {
            return ele2;
        }
        
        return (ele1 + ele2) / 2.0; 
        
    }
};




