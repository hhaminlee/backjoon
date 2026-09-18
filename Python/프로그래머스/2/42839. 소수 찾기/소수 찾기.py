import math
from itertools import permutations
def solution(numbers):
    answer = 0
    sorted_n = int(''.join(sorted(numbers, reverse=True)))
    n = len(str(sorted_n))
    is_prime = [True] * (sorted_n+1)
    is_prime[1] = False
    for i in range(2, int(math.sqrt(sorted_n)) + 1):
        if not is_prime[i]: 
            continue
        for j in range(2 * i, sorted_n + 1, i):
            is_prime[j] = False
    
    digits = [int(ch) for ch in numbers]
    print(digits)
    nums = set()
    for r in range(1, len(digits) + 1):  
        for p in permutations(digits, r):  
            nums.add(int("".join(map(str,p))))
    for num in nums:
        if num != 0 and is_prime[num]:
            answer += 1
    
    return answer