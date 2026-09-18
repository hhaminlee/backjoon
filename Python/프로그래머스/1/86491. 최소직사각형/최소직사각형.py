def solution(sizes):
    answer = 0
    big, small, max_w, max_h = 0, 10000, 0, 0
    for s1, s2 in sizes:
        big = max(s1, s2)
        small = min(s1, s2)
        max_w = max(max_w, big)
        max_h = max(max_h, small)
    print(max_w, max_h)
    answer = max_w * max_h
    return answer