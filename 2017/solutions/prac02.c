#include <stdio.h>

/*
 * A line contains up to 80 characters, including the newline.  fgets()
 * adds a null byte to terminate the string.
 *
 * Each line contains two words separated by a space.  sscanf() also adds a
 * null byte to terminate the string.
 */
 
int main(int argc, char **argv)
{
    char line[80 + 1], noun[80 + 1], verb[80 + 1];
    int items;
 
    while (fgets(line, sizeof(line), stdin)) {
	items = sscanf(line, "%80s %80s", noun, verb);
	if (items == 2)
	    printf("%s is %s today!\n", noun, verb);
    }
    return 0;
}

