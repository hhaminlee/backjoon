n = int(input())

bin_n = format(n, 'b')
reversed_bin_n = bin_n[::-1]
print(int(reversed_bin_n, 2))