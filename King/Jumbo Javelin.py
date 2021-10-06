import sys

def readline():
    return sys.stdin.readline().strip()

N = int(readline())
L = sum([int(readline()) for x in range(N)])
if N < 2:
    print(L)
else:
    print(L-N+1)
