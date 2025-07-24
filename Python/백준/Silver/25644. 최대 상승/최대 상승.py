import sys
input = sys.stdin.readline

n = int(input())
stocks = list(map(int, input().split()))
best = 0
min_price = stocks[0]
for i in stocks[1:]:
    if i - min_price > best:
        best = i - min_price
    if i < min_price:
        min_price = i
print(best if best else 0)