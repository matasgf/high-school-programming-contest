import sys

'''
Given a string, does the string contain an equal number of uppercase and 
lowercase letters? Ignore whitespace, numbers, and punctuation. Return the 
string “true” if balanced or the string “false” if not balanced.
'''
for line in sys.stdin:
    lower = 0
    upper = 0

    # Count number of lowercase and uppercase letters
    for x in range(0, len(line)):
        if 'a' <= line[x] <= 'z':
            lower = lower + 1
        elif 'A' <= line[x] <= 'Z':
            upper = upper + 1

    # Determine if balanced or not
    if lower == upper:
        print('true')
    else:
        print('false')

    # Repeat for each input line
