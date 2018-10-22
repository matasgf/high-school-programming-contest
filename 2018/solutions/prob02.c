#include <stdio.h>
#include <math.h>

/* Compile with "cc prob02.c -lm -o prob02" */

int main(int argc, char **argv)
{
    double f1, f2, f3, f4, f5;
    double total_mb, total_gb;

    while (scanf("%lf %lf %lf %lf %lf", &f1, &f2, &f3, &f4, &f5) == 5) {
        total_mb = f1 + f2 + f3 + f4 + f5;
        total_gb = total_mb / 1024;
        total_gb = roundf(total_gb * 2) / 2;
        printf("%.1f\n", total_gb);
    }
    return 0;
}
