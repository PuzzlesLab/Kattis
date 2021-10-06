import sys

text = sys.stdin.readline().strip()
e_count = len(text) - 2
print(text[0] + ('e' * e_count * 2) + text[-1])