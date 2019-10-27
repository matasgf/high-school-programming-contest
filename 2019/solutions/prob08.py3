import sys

'''
Sam builds forts with super secret security. To enter Sam’s forts, guests must 
say a secret passphrase that contains 3 words, and each word must begin or end 
with the letter “s”.

Given a string that contains a secret passphrase, output the string “welcome” 
if the passphrase is valid or output the string “denied” if the passphrase is 
invalid.
'''
for line in sys.stdin:
    # Split line into words
    words = line.split()

    if len(words) != 3:
        print('denied')
    else:
        # Allow access UNLESS word found does NOT begin or end with "s"
        welcome = 1

        # Check each word
        for x in range(0, len(words)):
            word = words[x]
            if word[0] != 's' and word[-1] != 's' and word[0] != 'S' and word[-1] != 'S':
                # Current word does not begin or end with "s". Deny access
                welcome = 0
                break

        if welcome == 1:
            print('welcome')
        else:
            print('denied')

    # Repeat for each input line
