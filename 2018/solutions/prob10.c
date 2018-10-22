#include <stdio.h>

int main(int argc, char **argv)
{
    unsigned int n, i;

    while (scanf("%u", &n) == 1) {
        i = 0;
        while (n) {
            if (n & 1)
                i++;
            n >>= 1;
        }
        printf("%u\n", i);
    }
    return 0;
}
