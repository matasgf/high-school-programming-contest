import sys

'''
Given an input that contains N integers (where N will always be 1 to 100), 
remove any duplicate integers and output the integers sorted from smallest 
to largest, each separated by a single space.
'''
for line in sys.stdin:
    # Read all integers into array keyed by integer value
    list = map(int, line.split())
    # Remove Duplicates
    list_unique = dict.fromkeys(list)
    # Sort the keys descending
    list_sorted = sorted(list_unique)
    # Output sorted list
    print(' '.join(map(str, list_sorted)))
    # Repeat for each input line
