n = int(input())

for _ in range(n):
    a, b = input().split()
    sorted_a = sorted(a)
    sorted_b = sorted(b)
    if sorted_a == sorted_b:
        print("Possible")
    else:
        print("Impossible")