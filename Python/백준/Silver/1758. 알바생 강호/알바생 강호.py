n = int(input())
tips = [int(input()) for _ in range(n)]
tips.sort(reverse=True)

result = 0
for i in range(n):
    result += max(0, tips[i] - i)

print(result)