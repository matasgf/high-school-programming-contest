#include <stdio.h>
 
int main(int argc, char **argv) {
    int numCases;
    char noun[99 + 1]; /* + '\0' */
    char verb[99 + 1]; /* + '\0' */
 
    scanf("%d", &numCases);
    while (numCases) {
        --numCases;
        scanf("%s %s", noun, verb);
        printf("%s is %s today!\n", noun, verb);
    }
    return 0;
}

