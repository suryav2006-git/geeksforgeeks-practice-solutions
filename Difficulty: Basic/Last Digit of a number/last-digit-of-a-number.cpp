#include <cstdlib>
#include <iostream>
using namespace std;

int main() {
    int n;
    cin >> n;
    n = abs(n);
    // code here
    int remain = n % 10;
    cout << remain;

    return 0;
}