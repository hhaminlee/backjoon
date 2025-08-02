from collections import Counter

n = int(input())

for i in range(n):
    result = 1
    d = {}
    m = int(input())
    for j in range(m):
        key, val = input().split()
        d[key] = val
    counter = Counter(d.values())
    for v in counter.values():
        result *= (v + 1)
    print(result-1)