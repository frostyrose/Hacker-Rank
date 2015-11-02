// World Generator v1.0

#include <stdio.h>
#include <string.h>

// Main Function
int main ( int argc, char * argv[] ) {
    int i, j;

    // Command Line
    int verticle = atoi(argv[1]);
    int width = atoi(argv[2]);
    FILE *fd = fopen(argv[3], "w");
    printf("Debug: Running world generator for matrix [%d,%d]:\n\n", verticle, width);

    // Make a map of size: (verticle x width)
    for(i = 0; i < verticle; i++) {
        for(j = 0; j < width; j++) {
            int r = 1 + rand() % 9;
            fprintf(fd, "%d\t", r);
        }
    fprintf(fd,"\n");
    }
    close(fd);

    return 0;
}
