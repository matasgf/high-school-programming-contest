#include <stdio.h>

int main(int argc, char **argv)
{
    char line[52];      /* 50 char word + newline + NULL byte */
    char *p;

    while (fgets(line, sizeof(line), stdin)) {
        p = line;
        while (*p != '\n') {
            *p += 3;
            if (*p > 'Z')
                *p -= 26;
            p++;
        }
        printf("%s", line);
    }
    return 0;
}
