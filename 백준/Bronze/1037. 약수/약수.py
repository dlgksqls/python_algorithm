n = int(input())

result = list(map(int,input().split()))

result.sort()

print(result[0] * result[len(result)-1])