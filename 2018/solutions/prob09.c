#include <stdio.h>

int square(unsigned int n)
{
    unsigned int i;

    for (i = 1; i <= n; i++)
        if (i * i == n)
            return 1;
    return 0;
}

int cube(unsigned int n)
{
    unsigned int i;

    for (i = 1; i <= n; i++)
        if (i * i * i == n)
            return 1;
    return 0;
}

int main(int argc, char **argv)
{
    unsigned int n;
    int s, c;

    while (scanf("%u", &n) == 1) {
        s = square(n);
        c = cube(n);
        if (s && c)
            printf("BOTH\n");
        else if (s)
            printf("PERFECT SQUARE\n");
        else if (c)
            printf("PERFECT CUBE\n");
        else
            printf("NEITHER\n");
    }
    return 0;
}
