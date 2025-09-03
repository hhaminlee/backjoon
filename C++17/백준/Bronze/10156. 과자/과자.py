a,b,c = map(int, input().split())

ans = int(a*b-c)
if(c>a*b):
    print("0")
else:
    print(ans)