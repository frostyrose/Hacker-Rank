#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    int n, i, height = 1, tests;
    
    // read paramaters
    fscanf(stdin,"%d\n", &tests);
    
    // loop and solve
    while(tests>0){
        height = 1;
        fscanf(stdin,"%d\n",&n);
        for(i = 1; i <= n; i++){
            if(i%2 == 1){
                height *= 2;
            }
            else{
                height++;
            }
        }
        fprintf(stdout, "%d\n", height);
        tests--;
    }
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */    
    return 0;
}
