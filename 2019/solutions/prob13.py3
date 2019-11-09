import sys

'''
Given a string, shift each alphabetic letter by 13 characters. Do not modify 
any numbers or punctuation in the input string. The solution is case sensitive!
'''
for line in sys.stdin:
    # Remove trailing whitespace
    letters = line.strip()

    # Process each letter
    encoded_letters = []
    for x in range(0, len(letters)):
        letter = letters[x]

        if letter.isupper():
            encoded_letter = chr(ord(letter) + 13)
            if not encoded_letter.isupper():
                encoded_letter = chr(ord(letter) - 13)
        elif letter.islower():
            encoded_letter = chr(ord(letter) + 13)
            if not encoded_letter.islower():
                encoded_letter = chr(ord(letter) - 13)
        else:
            encoded_letter = letter
        encoded_letters.append(encoded_letter)

    print(''.join(encoded_letters))
    # Repeat for each input line
