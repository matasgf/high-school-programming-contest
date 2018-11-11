import sys

for line in sys.stdin:
    n = int(line)
    count = 0

    while n:
        if n & 1:
            count += 1
        n >>= 1

    print(count)
