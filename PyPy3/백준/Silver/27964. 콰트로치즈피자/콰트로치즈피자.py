# 백준 27964 콰트로치즈피자

import sys
input = sys.stdin.readline
n = int(input())
cheese = input().split()

result = set()
for c in cheese:
    if c.endswith('Cheese'):
        result.add(c)
if len(result) >= 4:
    print('yummy')
else:
    print('sad')