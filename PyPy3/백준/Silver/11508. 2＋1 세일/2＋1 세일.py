n = int(input())

product = sorted([int(input()) for _ in range(n)], reverse=True)
pack = n // 3

sum_product = [product[i:i+3] for i in range(0, n, 3)]

result = 0
for i in range(len(sum_product)):
    if len(sum_product[i]) == 3:
        result += sum(sum_product[i]) - min(sum_product[i])
    else:
        result += sum(sum_product[i])
print(result)