import sys

chars = sys.stdin.readline().strip()
message = sys.stdin.readline().strip()
pokemon = ''
for i in range(0, len(message), 3):
    char_idx = int(message[i: i+3]) - 1
    pokemon += chars[char_idx]
print(pokemon)
