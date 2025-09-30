# 백준 2535 아시아 정보올림피아드
# 해결 방법: 정렬
# 문제 요약: 대회 결과가 입력으로 주어질 때, 메달 수상자를 결정하여 출력하는 프로그램을 작성하시오.(동일 국가 2명이상 제한)
# 처음 접근: 정렬 후, 국가별 인원수를 count하면서 3명 뽑기
# 시행착오: 동일국가 2명 제한을 위해 country 리스트를 따로 만들어서 count / 들어온 입력대로 출력 순서가 지켜지지 않음

import sys
input = sys.stdin.readline

n = int(input())

students = [list(map(int, input().split())) for _ in range(n)]
# 점수 높은 순으로 내림차순 정렬
students.sort(key=lambda x: -x[2])

country = [0] * 101
result = []
i = 0
while len(result) < 3:
    if country[students[i][0]+1] < 2:
        result.append((students[i][0], students[i][1]))
        country[students[i][0]+1] += 1
    i += 1

for c, m in result:
    print(c, m)