import heapq
n = int(input())
heap = []
cnt = 0

n_list = [int(input()) for _ in range(n)]
dasom = n_list[0]
for i in n_list[1:]:
    heapq.heappush(heap, -i)

if n > 1:
    while dasom <= -heap[0]:
        heapq.heappush(heap, heapq.heappop(heap)+1)
        dasom += 1
        cnt += 1
print(cnt)