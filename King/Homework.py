groups = input().split(';')
count = 0
for group in groups:
    if '-' in group:
        start, end = [int(x) for x in group.split('-')]
        count += (end - start + 1)
    else:
        count += 1
print(count)