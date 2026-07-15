class Solution {

    private void swapIfGreater(int[] a, int[] b, int ind1, int ind2) {
        if (a[ind1] > b[ind2]) {
            int temp = a[ind1];
            a[ind1] = b[ind2];
            b[ind2] = temp;
        }
    }

    public void mergeArrays(int a[], int b[]) {
        int n = a.length;
        int m = b.length;
        int len = n + m;
        
        int gap = (len / 2) + (len % 2);

        while (gap > 0) {
            int left = 0;
            int right = left + gap;

            while (right < len) {
                
                if (left < n && right >= n) {
                    swapIfGreater(a, b, left, right - n);
                } 
                
                else if (left >= n) {
                    swapIfGreater(b, b, left - n, right - n);
                } 
                
                else {
                    swapIfGreater(a, a, left, right);
                }
                
                left++;
                right++;
            }
            
            if (gap == 1) break;
            gap = (gap / 2) + (gap % 2);
        }
    }
}
