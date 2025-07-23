import sys
from collections import defaultdict
input = sys.stdin.readline

n = int(input())
a = []
sum_a = 0
for _ in range(n):
    x, y = map(int, input().split())
    a.append((x, y))
a.sort(key=lambda x: (x[1], x[0]), reverse=True)

grouped = defaultdict(list)
for i in a:
    grouped[i[1]].append(i)

result = [t for t in grouped.values() if len(t) > 1]

if result:
    for i in range(len(result)):
        sum_a += result[i][0][0] - result[i][1][0]
        sum_a += result[i][-2][0] - result[i][-1][0]
        for j in range(1, len(result[i])-1):
            sum_a += min(result[i][j][0] - result[i][j + 1][0], abs(result[i][j-1][0] - result[i][j][0]))
print(sum_a)