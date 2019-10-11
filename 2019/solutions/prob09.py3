import sys

'''
Sam sends encoded messages. Each message begins with a list of code words and 
the corresponding decoded words. You need to decode the message by replacing 
the code word with the decoded word.

Given a string that contains up to 50 word pairs and a second string that 
contains an encoded message, output the decoded message as a string. If the 
code word appears multiple times in the word pairs, only use the first code 
word and decoded word pair.
'''
line_number = 1
for line in sys.stdin:

    if line_number == 1:
        # Read keys
        keys = line.split()
        key = ''
        decode = {}
        for x in range(0, len(keys)):
            if key == '':
                key = keys[x]
            else:
                val = keys[x]
                if key not in decode.keys():
                    decode[key] = val
                key = ''

    elif line_number == 2:
        # Read encoded message
        encoded = line.split()

        # Decode message
        decoded_words = []
        for x in range(0, len(encoded)):
            encoded_word = encoded[x]
            decoded_words.append(decode[encoded_word])
        print(' '.join(decoded_words))

    line_number = line_number + 1
    # Repeat for each input line
