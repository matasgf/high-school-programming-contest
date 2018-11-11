import sys

line = sys.stdin.readlines()
valid = True

for i in range(0, 3):
    for j in range(0, 5):
        if line[i][j] != line[j][i]:
            valid = False
        if line[i][j] != line[4-i][4-j]:
            valid = False
        if line[i][j] != line[4-j][4-i]:
            valid = False

if valid:
    print("TRUE")
else:
    print("FALSE")
