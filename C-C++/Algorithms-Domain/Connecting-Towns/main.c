#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    int i, j, tests, towns, temp;
    int pathCount[100];
    long long int routes = 1;
    fscanf(stdin,"%d\n", &tests);
    fscanf(stdin,"%d\n", &towns);

    for(i = 0; i < tests; i++){
        for(j = 0; j < towns-1; j++){
            fscanf(stdin,"%d",&temp);
            pathCount[j] = temp;
        }
        for(j = 0; j < towns-1; j++){
            fscanf(stdin,"%d",&temp);
            routes = (routes * temp);
        }
        fprintf(stdout,"%ld\n", (routes%1234567));
        routes = 1;
    }
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    return 0;
}
ou
