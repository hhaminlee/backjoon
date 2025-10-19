# 백준 16916 부분 문자열
import sys

a = sys.stdin.readline().rstrip() # .rstrip()은 끝에 붙은 줄바꿈(\n) 제거
b = sys.stdin.readline().rstrip()

print(0 if a.find(b) == -1 else 1)