#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int value;
    cin>>value;
    if(value > 9){
        cout<<"Greater than 9";
    }
    else{
        if(value == 9){
            cout<<"nine";
        }
        else if(value == 8){
            cout<<"eight";
        }
        else if(value == 7){
            cout<<"seven";
        }
        else if(value == 6){
            cout<<"six";
        }
        else if(value == 5){
            cout<<"five";
        }
        else if(value == 4){
            cout<<"four";
        }
        else if(value == 3){
            cout<<"three";
        }
        else if(value == 2){
            cout<<"two";
        }
        else{
            cout<<"one";
        }
    }
   return 0;
}
