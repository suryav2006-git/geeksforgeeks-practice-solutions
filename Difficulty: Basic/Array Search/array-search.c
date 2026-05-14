// User function Template for C

int search(int arr[], int n, int x) {
    // Code here
    int i =0;
    
    for (i = 0 ; i<n ; i++) {
        if (arr[i] == x) {
            return i;
        }
    }
    return -1;
}