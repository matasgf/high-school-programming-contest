#include <stdio.h>

int main(int argc, char **argv)
{
    int i, j;
    char word[5][5 + 1];        /* 5 rows, 5 chars + '\0' per row */
    int valid = 1;

    for (i = 0; i < 5; i++)
        scanf("%5s", word[i]);

    for (i = 0; i < 3; i++) {
        for (j = 0; j < 5; j++) {
            if (word[i][j] != word[j][i])
                valid = 0;
            if (word[i][j] != word[4-i][4-j])
                valid = 0;
            if (word[i][j] != word[4-j][4-i])
                valid = 0;
        }
    }

    if (valid)
        printf("TRUE\n");
    else
        printf("FALSE\n");

    return 0;
}
