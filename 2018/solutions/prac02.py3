import sys

for line in sys.stdin:
    words = line.split()
    noun = words[0]
    verb = words[1]
    print("%s is %s today!" % (noun, verb))

