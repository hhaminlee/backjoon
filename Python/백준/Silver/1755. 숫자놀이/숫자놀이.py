m, n = map(int, input().split())
alpha = ['zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight', 'nine']
num_to_alpha = []

for i in range(m, n + 1):
    if i < 10:
        num_to_alpha.append(alpha[i])
    else:
        num_to_alpha.append(alpha[i//10] + " " + alpha[i%10])
num_to_alpha.sort()

result = []
cnt = 0
for s in num_to_alpha:
    if len(s.split()) > 1:
        result.append(str(alpha.index(s.split()[0])) + str(alpha.index(s.split()[1])))
    else:
        result.append(alpha.index(s))
    cnt += 1

for i in range(0, len(result), 10):
    print(" ".join(map(str, result[i:i+10])))