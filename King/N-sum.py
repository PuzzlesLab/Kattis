import sys

def readline():
    return sys.stdin.readline().strip()

readline();
print(sum([int(x) for x in readline().split()]))