while True:
    a = int(input())
    if a == 0:
        break
    word_list = [input().strip() for _ in range(a)]
    word_list.sort(key=lambda x: x.lower())
    print(word_list[0])
