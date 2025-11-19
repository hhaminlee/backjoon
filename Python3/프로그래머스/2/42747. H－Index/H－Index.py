def solution(citations):
    # n개 중 h번 이상 인용 논문 h개, 나머지 논문은 h번 이하 인용
    # 거꾸로 정렬 이후 앞에서부터 판단 -> 뒤에 논문은 정렬되어있는 상태이므로
    
    answer = 0
    cite = sorted(citations, reverse = True)
    for i in range(len(cite)):
        if len(cite[:i+1]) <= cite[i]:
            answer = len(cite[:i+1])
    return answer