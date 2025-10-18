n = int(input())

for _ in range(n):
    a = input().split()
    b = int(a[0])
    a[1] = a[1][:b-1] + a[1][b:]
    print(a[1])