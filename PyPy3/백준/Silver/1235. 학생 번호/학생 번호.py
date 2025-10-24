def suffix_length(a, b):
    cnt = 1
    # 뒤에서부터 하나씩 비교
    for x, y in zip(reversed(a), reversed(b)):
        if x == y:
            cnt += 1
        else:
            break
    return cnt

n = int(input())
num = [input().strip() for _ in range(n)]

max_suffix = 1
for i in range(n):
    for j in range(i+1, n):
        max_suffix = max(max_suffix, suffix_length(num[i], num[j]))

print(max_suffix)
