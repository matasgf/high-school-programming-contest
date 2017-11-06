import sys

lines = sys.stdin.readlines()
num_cases = int(lines[0])

case = 1
while case < num_cases + 1:
    line = lines[case].split()
    noun = line[0]
    verb = line[1]
    print("%s is %s today!" % (noun, verb))
    case = case + 1

