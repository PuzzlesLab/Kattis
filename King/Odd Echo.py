import sys

def readline():
    return sys.stdin.readline().strip()

lines = int(readline())
for i in range(lines):
    curr = readline()
    if i%2 == 0:
        print(curr)