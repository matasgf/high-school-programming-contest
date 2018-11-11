#include <stdio.h>

int main(int argc, char **argv)
{
    char line[11];      /* 9 digit integer + newline + NULL byte */
    int i, digit, total, check;

    while (fgets(line, sizeof(line), stdin)) {
        line[9] = '\0';

        total = 0;
        for (i = 0; i < 9; i++) {
            digit = line[i] - '0';
            total += (i + 1) * digit;
        }
        check = total % 11;

        printf("%s%c\n", line, check == 10 ? 'X' : '0' + check);
    }
    return 0;
}
