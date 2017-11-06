import sys

for line in sys.stdin:
    coefficient, exponent = line.split()
    if (float(coefficient) == 0 and int(exponent) == 0):
        break

    print("%.2f" % (float(coefficient) * (10 ** int(exponent))) )

