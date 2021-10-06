import sys

def readline():
    return sys.stdin.readline().strip()

W = int(readline())
N = int(readline())
A = 0
for i in range(N):
    w, l = [int(x) for x in readline().split()]
    A += w*l
print(int(A/W))