import sys

def square(n):
    for i in range(1, n + 1):
        if i * i == n:
            return True
    return False

def cube(n):
    for i in range(1, n + 1):
        if i * i * i == n:
            return True
    return False

for line in sys.stdin:
    n = int(line)
    s = square(n)
    c = cube(n)
    if s and c:
        print("BOTH")
    elif s:
        print("PERFECT SQUARE")
    elif c:
        print("PERFECT CUBE")
    else:
        print("NEITHER")
