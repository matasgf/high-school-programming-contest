import sys

'''
Parse the input string that contains integers, plus sign (+), minus sign (-), 
and ends with equals sign (=). Perform the addition and subtraction and return 
the result.

Assume line only contains digits, plus sign, minus sign, and equals sign. 
Assume line always begins with an integer and ends with an equal sign.
'''
for line in sys.stdin:
    # Remove trailing whitespace
    line = line.strip()

    # Add spaces before and after plus and minus and equal signs
    line = line.replace('+',' + ')
    line = line.replace('-',' - ')
    line = line.replace('=',' = ')

    # Split string into list
    terms = line.split()

    result = 0
    for x in range(0, len(terms)):
        term = terms[x]

        if x == 0:
            # Save first item as result
            result = int(term)
        elif term == '+' or term == '-':
            # Save plus sign or minus sign as operator
            op = term
        elif term == '=':
            # Finish when we encounter equal sign
            break
        else:
            # Perform plus or minus action
            if op == '+':
                result = result + int(term)
            elif op == '-':
                result = result - int(term)

    print(result)
    # Repeat for each input line
