n = int(input())
a = [100, 100]
for i in range(n):
    li = list(map(int, input().split()))
    if li[0] > li[1]:
        a[1] = a[1]-li[0]
    elif li[0] < li[1]:
        a[0] = a[0]-li[1]
print(a[0])
print(a[1])
