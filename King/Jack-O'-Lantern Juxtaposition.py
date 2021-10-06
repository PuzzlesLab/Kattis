import sys

nums = [int(x) for x in sys.stdin.readline().split()]
prod = 1
for num in nums:
    prod *= num
print(prod)