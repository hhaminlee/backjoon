def solution(arr):
    answer = []
    answer.append(arr[0])
    for i in arr:
        if answer and i != answer[len(answer)-1]:
            answer.append(i)
    
    return answer