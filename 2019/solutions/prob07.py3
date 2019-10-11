import sys

'''
Input contains a single phone number always formatted with the number 1, 
followed by a dash, followed by a combination of 10 alphanumeric characters 
and any number of dashes. Here are several sample inputs and outputs.
'''
for line in sys.stdin:

    # Remove trailing whitespace
    line = line.strip()

    # Associate phone keypad letters to digits according to this arrangement
    dialpad = {
        'A': '2', 'B': '2', 'C': '2',
        'D': '3', 'E': '3', 'F': '3',
        'G': '4', 'H': '4', 'I': '4',
        'J': '5', 'K': '5', 'L': '5',
        'M': '6', 'N': '6', 'O': '6',
        'P': '7', 'Q': '7', 'R': '7', 'S': '7',
        'T': '8', 'U': '8', 'V': '8',
        'W': '9', 'X': '9', 'Y': '9', 'Z': '9',
    }

    # Decode each digit from dialpad map
    decoded_digits = []
    for x in range(0, len(line)):
        digit = line[x].upper()
        if digit in dialpad.keys():
            digit = dialpad[digit]
        decoded_digits.append(digit)

    print(''.join(decoded_digits))

    # Repeat for each input line
