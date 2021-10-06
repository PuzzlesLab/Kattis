import sys

def readline():
    return sys.stdin.readline().strip()

P = int(readline())
for i in range(P):
    K, N = [int(x) for x in readline().split()]
    print(K, int((N * (2+N-1) / 2) + N))