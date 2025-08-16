t = int(input())

# 중앙에서부터 작은 값들 오른쪽, 왼쪽에 넣기
for i in range(t):
    n = int(input())
    sub_list = []
    result = -1
    l = list(map(int, input().split()))
    l.sort(reverse=True)
    for j in range(0, len(l)-1, 2):
        sub_list.append(l[j])
        sub_list.insert(0, l[j+1])
    # 길이가 홀수일 경우 값 하나가 안들어가서 넣어주기
    if len(l) % 2 != 0:
        sub_list.insert(0, l[len(l)-1])

    for k in range(len(sub_list) - 1):
        if result < abs(sub_list[k] - sub_list[k+1]):
            result = abs(sub_list[k] - sub_list[k+1])
    # 첫번째랑 마지막 값도 비교
    if result < abs(sub_list[0] - sub_list[len(sub_list) - 1]):
        result = abs(sub_list[0] - sub_list[len(sub_list) - 1])
    print(result)