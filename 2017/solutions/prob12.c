#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <math.h>
#include <string.h>

bool isImpoliteNumber(int num);

int main (void)
{
	char buffer[BUFSIZ];
	char* line;
	int number;

	while (fgets(buffer, sizeof buffer, stdin) != NULL) {
		line = strchr(buffer, '\n');
		if (line != NULL) {
			*line = '\0';
		}

		number = atoi(buffer);
		if (number == 0)
			return 0;

		if (isImpoliteNumber(number)) {
			printf("%d is not polite\n", number);
		}
		else {
			printf("%d is polite\n", number);
		}
	}

	return 1;
}

// only return true for powers of two (e.g. 2,4,8,16,32,64...)
bool isImpoliteNumber(int num)
{
	// log2(num)
	int log2 = log(num) / log(2);
	// confirm 2^log2 equals num
	return pow(2, log2) == num;
}

