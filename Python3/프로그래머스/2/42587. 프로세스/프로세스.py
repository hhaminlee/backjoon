def solution(priorities, location):
    stack = []
    for idx, val in enumerate(priorities):
        stack.append((idx, val))
    answer = 0
    while stack:
        process = stack.pop(0)
        if stack and process[1] < max(p for _, p in stack):
            stack.append(process)
        else:
            answer += 1
            if process[0] == location:
                return answer
    
    return answer