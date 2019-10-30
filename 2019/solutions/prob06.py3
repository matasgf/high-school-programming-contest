import sys

'''
Given an input that contains N integers (where N will always be 1 to 100), 
output the two smallest integers that are closest together, separated by a 
single space. The smallest number should be output first. Each list will 
contain at least two unique integer values. Each integer value will be 
between -100 and 100.
'''
for line in sys.stdin:
    # Read all integers into array keyed by integer value
    list = map(int, line.split())
    # Remove Duplicates
    list_unique = dict.fromkeys(list)
    # Sort the keys ascending
    list_sorted = sorted(list_unique)

    # Check the distance between each pair. Determine position of smallest distance
    distance = 999
    position = 0
    for x in range(0, len(list_sorted) - 1):
        item1 = list_sorted[x]
        item2 = list_sorted[x+1]
        item_diff = item2 - item1
        if item_diff < distance:
            distance = item_diff
            position = x

    # Output two closest integers from list
    if len(list_sorted) > 1:
        print(list_sorted[position], list_sorted[position+1])
    else:
        print(list_sorted[position])

    # Repeat for each input line
