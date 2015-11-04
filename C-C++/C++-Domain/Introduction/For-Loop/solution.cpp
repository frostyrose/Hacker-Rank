#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int value,a,b;
    cin>>a>>b;
    for(int value = a; value <= b; value++){
        if(value > 9){
            if(value %2 == 0){
                cout<<"even"<<endl;
            }
            else{
                cout<<"odd"<<endl;
            }
        }
        else{
            if(value == 9){
                cout<<"nine"<<endl;
            }
            else if(value == 8){
                cout<<"eight"<<endl;
            }
            else if(value == 7){
                cout<<"seven"<<endl;
            }
            else if(value == 6){
                cout<<"six"<<endl;
            }
            else if(value == 5){
                cout<<"five"<<endl;
            }
            else if(value == 4){
                cout<<"four"<<endl;
            }
            else if(value == 3){
                cout<<"three"<<endl;
            }
            else if(value == 2){
                cout<<"two"<<endl;
            }
            else{
                cout<<"one"<<endl;
            }
        }  
    }
    
   return 0;
}

