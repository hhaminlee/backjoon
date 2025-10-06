n = int(input())
result = []
for i in range(n):
    a = list(map(int, input().split()))
    b = max(a[:2])
    c = sorted(a[2:])
    result.append(b + sum(c[-2:]))
print(max(result))