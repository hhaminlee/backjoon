def solution(schedules, timelogs, startday):
    # startday % 7이 6 또는 0일 때 주말, 상관없음
    # 제 시간에 출근을 못한 사람만 찾아서 이후 줄여주면 됨
    answer = len(schedules)
    s = startday
    # i-1 번째 사람
    for i in range(len(timelogs)):
        startday = s
        hope_h = (schedules[i] - schedules[i]%100) // 100
        hope_m = schedules[i] % 100
        
        if hope_m >= 50:
            hope_h += 1
            hope_m = (hope_m + 10) % 60
        else:
            hope_m += 10
        for times in timelogs[i]:
            if startday%7!=6 and startday%7!=0:
                if hope_h < (times-times%100) // 100:
                    answer -= 1
                    break
                elif hope_h == (times-times%100) // 100 and hope_m < times%100:
                    answer -= 1
                    break
            
            startday += 1
    return answer