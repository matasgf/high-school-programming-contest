import sys

'''
We have received a random list of page numbers that we need to review. We 
would like to review the pages in order and we would like to avoid reviewing 
any pages twice. We would also like to make our final list appear as short as 
possible, by listing page ranges instead of individual pages whenever possible.

Given an input that contains N integers representing page numbers (where N 
will always be 1 to 100), remove any duplicate page numbers and return the 
list of page numbers in ascending order, separated by commas. Furthermore, 
condense two or more consecutive page numbers into a page range (e.g. “2,3,4” 
would condense to “2-4”).
'''
for line in sys.stdin:
    # Read all integers into array keyed by integer value
    list = map(int, line.split())
    # Remove Duplicates
    list_unique = dict.fromkeys(list)
    # Sort the keys ascending
    list_sorted = sorted(list_unique)

    # Build output string
    output = ''
    for page in range(0, len(list_sorted)):
        if page == 0:
            # Always print first page number
            output = str(list_sorted[page])
        elif list_sorted[page] - list_sorted[page-1] > 1:
            # Begin next group if gap between current page number and prior page number
            output = output + ', ' + str(list_sorted[page])
        elif page == len(list_sorted) - 1:
            # End range if last page
            output = output + '-' + str(list_sorted[page])
        elif list_sorted[page+1] - list_sorted[page] > 1:
            # End range if gap between current page number and next page number
            output = output + '-' + str(list_sorted[page])

    # Output sorted list
    print(output)
    # Repeat for each input line
