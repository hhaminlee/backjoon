import sys
input = sys.stdin.readline
d = {}
n = int(input())
for _ in range(n):
    student = list(map(int, input().split()))
    d[student[0]] = student[1:]

result = list(d.items())
for i in range(4):
    sorted_students = sorted(result, key=lambda x: (-x[1][i], x[0]))
    aa = sorted_students[0][0]

    print(aa, end=' ')
    result = [x for x in result if x[0] != aa]

