n, k = input().split()
n = int(n)
k = int(k)

curr_sum = 0
for i in range(k):
    curr_sum += int(input().strip())
min = (curr_sum+(n-k)*-3)/n
max = (curr_sum+(n-k)*3)/n
print(f'{min} {max}')
