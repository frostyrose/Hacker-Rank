# Python 2
# Enter your code here. Read input from STDIN. Print output to STDOUT
testCases = int(input())
while testCases:
    data = raw_input().split(" ")
    arrivalTimes = raw_input().split(" ")
    onTime = 0
    for student in range(0,int(data[0])):
        if int(arrivalTimes[student]) <= 0:
            onTime += 1
    if onTime >= int(data[1]):
        print("NO")
    else:
        print("YES")
    testCases -= 1
        
