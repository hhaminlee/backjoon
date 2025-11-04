from sys import stdin
input = stdin.readline

n = int(input())
for _ in range(n):
    left, right = [], []
    for ch in input().strip():
        if ch == '<' and left:
            right.append(left.pop())
        elif ch == '>' and right:
            left.append(right.pop())
        elif ch == '-' and left:
            left.pop()
        elif ch.isalnum():
            left.append(ch)
    print(''.join(left + right[::-1]))
