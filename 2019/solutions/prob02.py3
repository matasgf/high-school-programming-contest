import sys

'''
Given an input that contains N integers (where N will always be 1 to 100), 
output the 3 largest value integers sorted from largest to smallest, each 
separated by a single space.
'''
for line in sys.stdin:
    # Read all integers into array keyed by integer value
    list = map(int, line.split())
    # Remove Duplicates
    list_unique = dict.fromkeys(list)
    # Sort the keys descending
    list_sorted = sorted(list_unique, reverse=True)
    # Output first 3 keys from list
    position = 0
    output = []
    for value in list_sorted:
        output.append(str(value))
        position = position + 1
        if position >= 3:
            break
    print(' '.join(output))
    # Repeat for each input line
