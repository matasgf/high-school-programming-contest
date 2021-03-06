import sys

def duplicates(line):
    dict = {}

    words = line.split()
    for word in words:
        if word in dict:
            return True

        dict[word] = 1

    return False

for line in sys.stdin:
    if duplicates(line):
        print("TRUE")
    else:
        print("FALSE")
