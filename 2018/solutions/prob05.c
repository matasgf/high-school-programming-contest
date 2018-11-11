#include <stdio.h>
#include <string.h>

int main(int argc, char **argv)
{
    char line[52];      /* 50 char word + newline + NULL byte */
    char *i, *j;
    int first = 1;

    while (fgets(line, sizeof(line), stdin)) {
        i = &line[0];                   /* first character */
        j = &line[strlen(line) - 2];    /* last character (skip newline) */

        while (i <= j) {
            if (first)
                putchar(*i++);
            else
                putchar(*j--);
            first = !first;
        }

        putchar('\n');
    }
    return 0;
}
