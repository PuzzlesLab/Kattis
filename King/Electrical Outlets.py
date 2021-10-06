import sys

def readline():
    return sys.stdin.readline().strip()

N = int(readline())
for i in range(N):
    nums = [int(x) for x in readline().split()]
    K = nums[0]
    if K:
        ans = sum(nums[1:])-K+1
        print(ans)
    else:
        print('1')
