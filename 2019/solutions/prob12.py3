import sys

'''
Given two strings, determine if the first string from a magazine cover 
contains all of the letters you will need to create the ransom note shown in 
the second string.

This is case sensitive! Ignore spaces. Do NOT ignore numbers or punctuation.
'''
line_number = 1
for line in sys.stdin:

    # Remove trailing whitespace
    line = line.strip()
    # Ignore all spaces
    line = line.replace(' ','')

    if line_number == 1:
        # Save each magazine character to a list. Ignore spaces.
        mag_letters = []
        for x in range(0, len(line)):
            mag_letters.append(line[x])

    elif line_number == 2:
        incomplete = 0

        # Save each message character to a list. Ignore spaces.
        msg_letters = []
        for x in range(0, len(line)):
            msg_letter = line[x]
            if mag_letters.count(msg_letter):
                # Letter found. Append to message.
                msg_letters.append(msg_letter)

                # Remove from magazine letters
                position = mag_letters.index(msg_letter)
                mag_letters.pop(position)
            else:
                incomplete = 1
                break

        if incomplete == 0:
            print('true')
        else:
            print('false')

    line_number = line_number + 1
    # Repeat for each input line
