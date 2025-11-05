from collections import deque

def solution(bridge_length, weight, truck_weights):
    answer = 0
    i = 0
    result = deque()
    result.extend([0]*bridge_length)
    len_t = len(truck_weights)
    cur_weight = 0
    while True:
        left = result.popleft()
        cur_weight -= left
            
        if i < len_t:
            if cur_weight + truck_weights[i] <= weight:
                result.append(truck_weights[i])
                cur_weight += truck_weights[i]
                i += 1
            else:
                result.append(0)
                
        answer += 1
        
        if not result:
            break
    return answer