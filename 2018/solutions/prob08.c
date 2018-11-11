#include <stdio.h>
#include <string.h>

int copies(char *line, char *needle)
{
    char copy[82];
    char *p, *save, *word;
    int count = 0;

    strncpy(copy, line, sizeof(copy));
    for (p = copy; ; p = NULL) {
        word = strtok_r(p, " \n", &save);
        if (!word)
            return count;

        if (!strcmp(needle, word))
            count++;
    }
}

int main(int argc, char **argv)
{
    char line[82], copy[82];    /* 80 char word + newline + NULL byte */
    char *p, *save, *word;
    int dup;

    while (fgets(line, sizeof(line), stdin)) {
        strncpy(copy, line, sizeof(copy));

        dup = 0;
        for (p = copy; ; p = NULL) {
            word = strtok_r(p, " \n", &save);
            if (!word)
                break;

            if (copies(line, word) > 1)
                dup = 1;
        }
        printf("%s\n", dup ? "TRUE" : "FALSE");
    }
    return 0;
}
