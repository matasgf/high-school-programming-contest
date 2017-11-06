import sys
 
lines = sys.stdin.readlines()
num_cases = int(lines[0])

case = 1
while case < num_cases + 1:
    output = ""
    word1, word2, word3 = lines[case].split()
    for a in word1:
        for b in word2:
            if (b == a):
                for c in word3:
                    if (c == a and a not in output):
                        output += a
    print("%s" % output)
    case = case + 1

