str = input()
a = ''
for ch in str:
    if ch.islower():
        a += ch.upper() 
    else:
        a += ch.lower()
print(a)