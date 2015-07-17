# Python 2
# Enter your code here. Read input from STDIN. Print output to STDOUT
V = str(input())
n = int(input())
arry = raw_input().split(" ")
for i in range(n):
    if(arry[i] == V):
        print i
        break
