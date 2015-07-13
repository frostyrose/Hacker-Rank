#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */    
    int totalNumbers, pos = 0, zero = 0, neg = 0, i, temp;
    scanf("%d", &totalNumbers);
    for(i = 0; i < totalNumbers; i++){
        scanf("%d", &temp);
        if(temp > 0){
            pos++;
        }
        else if(temp < 0){
            neg++;
        } 
        else{
            zero++;
        }
    }
    //Print Pos, Neg, Zero
    printf("%.3f\n", ((float)pos)/totalNumbers);
    printf("%.3f\n", ((float)neg)/totalNumbers);
    printf("%.3f\n", ((float)zero)/totalNumbers);
    return 0;
}
