#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    int n,temp;
    cin>>n;
    int arry[n];
    for(int i = 0; i < n; i++){
        cin>>temp;
        arry[i] = temp;
    }
    for(int i = n-1; i > -1; i--){
        temp = arry[i];
        cout<<temp<<" ";
    }
    return 0;
}
