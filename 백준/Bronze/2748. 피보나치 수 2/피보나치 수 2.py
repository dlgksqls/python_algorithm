fibo = [0] * 91

fibo[0] = 0
fibo[1] = 1
fibo[2] = 1

for i in range(3, len(fibo)):
    fibo[i] = fibo[i-1] + fibo[i-2]

n = int(input())

print(fibo[n])