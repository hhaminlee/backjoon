import heapq

n = int(input())

heap = []
for i in range(n):
    kids = input().split()
    if int(kids[0]) == 0:
        if heap:
            print(-heapq.heappop(heap))
        else:
            print(-1)
    else:
        for kid in kids[1:]:
            heapq.heappush(heap, -int(kid))
