import sys

# Brute Force approach. Try combinations with largest packages first.
def process(num):
    # Determine maximum package count for each package size
    max13 = int(round(float(num)/13))
    max11 = int(round(float(num)/11))
    max7 = int(round(float(num)/7))

    # Loop through each possible combination. Use largest package sizes first.
    for pkg13 in range(max13, 0, -1):
        for pkg11 in range(max11, 0, -1):
            for pkg7 in range(max7, 0, -1):
                sum = pkg13 * 13 + pkg11 * 11 + pkg7 * 7
                if sum == num:
                    pkgs = pkg7 + pkg11 + pkg13
                    print("%s %s %s %s %s" % (num, pkg7, pkg11, pkg13, pkgs))
                    return 1
    # No valid combinations
    print("%s" % num)
    return 0

for line in sys.stdin.readlines():
    num = int(line)
    if num == 0:
        break;

    process(num)

