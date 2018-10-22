#include <stdio.h>
#include <stdlib.h>

int main(int argc, char **argv)
{
    char line[82];      /* 80 char line + newline + NULL byte */
    char *p, *np;
    long int at_bat;
    int bases, at_bats;
    char slug[10];
    int count;

    while (fgets(line, sizeof(line), stdin)) {
        bases = 0;
        at_bats = 0;

        p = line;
        while (p) {
            at_bat = strtol(p, &np, 10);
            if (np == p)
                break;

            if (at_bat != -1) {
                bases += at_bat;
                at_bats++;
            }
            p = np;
        }

        if (!at_bats)
            continue;

        /* trim trailing zeroes after the decimal point */
        count = snprintf(slug, sizeof(slug), "%.4f", (double) bases / at_bats);
        if (count < sizeof(slug)) {
            p = &slug[count - 1];
            while (*p == '0') {
                *p-- = '\0';
            }
        }

        printf("%s\n", slug);
    }
    return 0;
}
