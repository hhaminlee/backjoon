import heapq
def solution(scoville, K):
    count = 0
    heapq.heapify(scoville)
    while len(scoville) > 1:
        min_sco = heapq.heappop(scoville)
        if min_sco >= K:
            return count
        min2_sco = heapq.heappop(scoville)
        heapq.heappush(scoville, min_sco + min2_sco*2)
        count += 1
    return count if scoville[0] >= K else -1