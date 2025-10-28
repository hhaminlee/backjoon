# 백준 8진수, 10진수, 16진수

x = input()
# 이 부분에서 숫자 0과 비교하는 것이 아닌, 문자 0과 비교해야함
# x를 input으로 받고 있기 때문에 문자열로 인식되기 때문
if x[0:2] == '0x':
    print(int(x, 16))
elif x[0] == '0':
    print(int(x, 8))
else:
    print(int(x))