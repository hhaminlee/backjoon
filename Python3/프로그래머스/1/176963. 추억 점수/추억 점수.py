def solution(name, yearning, photo):
    answer = []
    d = dict(zip(name, yearning))
    for li in photo:
        photo_sum = 0
        for p in li:
            if p in name:
                photo_sum += d[p]
        answer.append(photo_sum)
    return answer