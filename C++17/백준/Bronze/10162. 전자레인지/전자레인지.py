time = int(input())
# 10, 60, 300
count = [0, 0, 0]
a = -1
while time > 0:
    if time >= 300:
        time = time-300
        count[0] = count[0]+1
    elif time >= 60:
        time = time-60
        count[1] = count[1]+1
    elif time >= 10:
        time = time-10
        count[2] = count[2]+1
    else:
        a = 0
        break
if a == -1:
    print(count[0], count[1], count[2])
else:
    print("-1")

