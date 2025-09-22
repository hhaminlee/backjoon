from collections import Counter

n, c = map(int, input().split())
a = list(map(int, input().split()))

counter = Counter(a)

for num, freq in counter.most_common():
    print((str(num) + ' ') * freq, end='')