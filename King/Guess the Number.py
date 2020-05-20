minv = 1
maxv = 1000
wrong_count = 0
while True:
    guess = int((minv+maxv)/2);
    print(guess)
    s = input()
    if s == 'lower':
        maxv = guess-1;
        wrong_count += 1
    elif s == 'higher':
        minv = guess+1;
        wrong_count += 1
    elif s == 'correct':
        break
    if wrong_count == 10:
        break