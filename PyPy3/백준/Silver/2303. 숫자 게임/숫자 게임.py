# 백준 2303 숫자 게임

from itertools import combinations
n = int(input())
num_list = []
for i in range(n):
    max_num = 0
    tmp = map(int, input().split())
    for i in combinations(tmp, 3):
        if (sum(i)%10) >= max_num:
            max_num = sum(i)%10
    num_list.append(max_num)

answer = -1
max_num = 0
for i in range(len(num_list)):
    if num_list[i] >= max_num:
        max_num = num_list[i]
        answer = i+1
print(answer)