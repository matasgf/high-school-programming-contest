import sys

def getHashTable():
    hash = {}
    for letter in "ABCDEFGHIJKLMNOPQRSTUVWXYZ":
        hash[letter] = False
    return hash

for line in sys.stdin:
    line = line.strip()
    if (line == "."):
        break

    pangram = True
    perfect = True
    hash = getHashTable()

    for letter in line:
        if (letter in hash.keys()):
            if (hash[letter] == False):
                hash[letter] = True
            else:
                perfect = False

    for letter, value in hash.items():
        if (value == False):
            pangram = False
            break

    if (pangram == True):
        if (perfect == True):
            print("PERFECT: %s" % line)
        else:
            print("PANGRAM: %s" % line)
    else:
        print("NEITHER: %s" % line)

