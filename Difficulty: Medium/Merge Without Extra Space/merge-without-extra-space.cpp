#include <vector>

class Solution {
private:
    void swapIfGreater(std::vector<int>& arr1, std::vector<int>& arr2, int ind1, int ind2) {
        if (arr1[ind1] > arr2[ind2]) {
            int temp = arr1[ind1];
            arr1[ind1] = arr2[ind2];
            arr2[ind2] = temp;
        }
    }

public:
    void mergeArrays(std::vector<int>& a, std::vector<int>& b) {
        int n = a.size();
        int m = b.size();
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
};
