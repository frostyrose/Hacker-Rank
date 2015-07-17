# Python 2
# Enter your code here. Read input from STDIN. Print output to STDOUT
testCases = int(input())
while testCases:
    n = str(input())
    count = 0
    for char in n:
        if int(char) and not int(n)%int(char):
            count += 1
    print count
    testCases -= 1
