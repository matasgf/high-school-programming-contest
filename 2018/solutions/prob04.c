#include <stdio.h>

unsigned long trib(unsigned long n)
{
    if (n == 0)
        return 1;

    if (n == 1)
        return 1;

    if (n == 2)
        return 2;

    return trib(n - 1) + trib(n - 2) + trib(n - 3);
}

int main(int argc, char **argv)
{
    unsigned long n;

    while (scanf("%lu", &n) == 1) {
        printf("%lu\n", trib(n));
    }
    return 0;
}
