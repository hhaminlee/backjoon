n = int(input())
sen = input()
a = 0
b = 0
ans = list(sen)
for i in range (n):
    if ans[i] == 'A':
        a += 1
    elif ans[i] == 'B':
        b += 1
if a>b:
    print("A")
elif a<b:
    print("B")
else:
    print("Tie")