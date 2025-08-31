def solution(s):
    answer = True
    result = []
    for ch in s:
        if ch == '(':
            result.append(1)
        else:
            if not result:
                return False
            result.pop()
    if len(result) != 0:
        answer = False
    return answer