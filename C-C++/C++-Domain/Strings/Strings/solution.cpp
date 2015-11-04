#include <iostream>
#include <string>
using namespace std;

int main() {
   // Complete the program
    string a,b;
    char temp;
    cin>>a>>b;
    cout<<a.size()<<" "<<b.size()<<endl<<a+b<<endl;
    temp = a[0];
    a[0]=b[0];
    b[0]=temp;
    cout<<a<<" "<<b<<endl;
    return 0;
}
