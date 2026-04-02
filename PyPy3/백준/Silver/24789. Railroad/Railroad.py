# 백준 24789 Railroad 
x, y = list(map(int, input().split()))
print('possible' if (x*4+y*3) % 2 == 0 else 'impossible')