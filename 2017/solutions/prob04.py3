import sys

def toSumDigits(num):
    sum = 0
    for digit in num:
        sum = sum + int(digit)
    return sum

def isDivisibleByThree(num):
    if (num % 3 == 0):
        return "YES"
    else:
        return "NO"

lines = sys.stdin.readlines()
num_cases = int(lines[0])
 
case = 1
while case < num_cases + 1:
    num = int(lines[case].strip())
    sum = toSumDigits(str(num))
    divisible = isDivisibleByThree(num)
    print("%d %d %s" % (num, sum, divisible))

    case = case + 1

