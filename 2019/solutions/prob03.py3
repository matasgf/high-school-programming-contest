import sys

'''
We have received a random list of page numbers that we need to review. We 
would like to review the pages in order and we would like to avoid 
reviewing any pages twice.

Given an input that contains N integers (where N will always be 1 to 100), 
remove any duplicate integers and return the list in ascending order, 
separated by spaces.
'''
for line in sys.stdin:
    # Read all integers into array keyed by integer value
    list = map(int, line.split())
    # Remove Duplicates
    list_unique = dict.fromkeys(list)
    # Sort the keys ascending
    list_sorted = sorted(list_unique)
    # Output sorted list
    print(' '.join(map(str, list_sorted)))
    # Repeat for each input line
