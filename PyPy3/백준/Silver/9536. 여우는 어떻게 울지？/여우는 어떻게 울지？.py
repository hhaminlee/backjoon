t = int(input())

for i in range(t):
    fox_say = input().strip().split()
    animals = {}
    while True:
        animal = input().strip()
        if animal == 'what does the fox say?':
            break
        animals[animal.split(' goes ')[0]] = animal.split(' goes ')[1]

    for k, v in animals.items():
        while v in fox_say:
            fox_say.remove(v)
    print(*fox_say)