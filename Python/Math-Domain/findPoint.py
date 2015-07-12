# Python 2
# Enter your code here. Read input from STDIN. Print output to STDOUT
numTests = int(input())
while numTests:
    data = raw_input().split(" ")
    deltaX = int(data[2]) - int(data[0])
    deltaY = int(data[3]) - int(data[1])
    newPair = deltaX + int(data[2]), deltaY + int(data[3])
    print str(newPair[0]) + " " + str(newPair[1])
    numTests -= 1
