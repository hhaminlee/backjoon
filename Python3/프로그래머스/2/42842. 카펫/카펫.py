def solution(brown, yellow):
    # 가로 길이는 세로길이보다 크거나 같음
    # 노란색을 먼저 채워두고 갈색을 채워나가면서 정답 찾기
    # 노란색의 가로 세로를 구할 때 완전탐색 -> 가장 가까운 곱을 사용 -> 안됨
    # factor = []
    # for i in range(1, yellow+1):
    #     if yellow % i == 0:
    #         factor.append(i)
    # print(factor)
    # if len(factor) == 1 or len(factor) % 2 != 0:
    #     answer.extend([factor[(len(factor)-1)//2]+2, factor[(len(factor)-1)//2]+2])
    # else:
    #     answer.extend([factor[(len(factor)-1)//2+1]+2, factor[(len(factor)-1)//2]+2])
    answer = []
    for i in range(1, int(yellow**0.5)+1):
        if yellow % i == 0:
            x = int(yellow/i)
            y = i
            print(x, y)
            if (x+2) * (y+2) == yellow+brown:
                answer.extend([x+2,y+2])
    return answer