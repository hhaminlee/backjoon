n = int(input())
d={}

for i in range(n):
    k, v1, v2, v3 = map(int, input().split())
    d[k] = (v1 * v2 * v3, v1 + v2 + v3)

sorted_items = sorted(d.items(), key=lambda x: (x[1][0], x[1][1], x[0]))

print(' '.join(str(sorted_items[i][0]) for i in range(3)))