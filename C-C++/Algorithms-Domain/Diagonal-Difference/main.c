#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int DEBUG = 0;

int main(int argc, char *argv[]) {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    int size, i, j, diag1 = 0, diag2 = 0;
    //FILE * INPUT = fopen("input.txt","r");
    scanf("%d\n",&size);
    int array[size][size];
    for(i=0;i<size;i++){
        for(j=0;j<size;j++){
            scanf("%d", &array[i][j]);
        }
    }
    for(i=0; i<size; i++){
        diag1 += array[i][i];
    }
    for(i=size-1, j=0; i>=0; i--, j++){
        diag2 += array[i][j];
    }
    //diag1 = abs(diag1);
    //diag2 = abs(diag2);
    if(DEBUG){printf("Diag1: %d   Diag2: %d\n", diag1, diag2);}
    printf("%d", abs(diag1-diag2));
    return 0;
}
