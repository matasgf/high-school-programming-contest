import sys

for line in sys.stdin:
    line = line.rstrip()
    cipher = ""

    for c in line:
        if c < "X":
            cipher = cipher + chr(ord(c) + 3)
        else:
            cipher = cipher + chr(ord(c) - 26 + 3)

    print(cipher)
