# Python 2
# Enter your code here. Read input from STDIN. Print output to STDOUT
testCases = int(raw_input())
while testCases:
    max = int(raw_input())
    min = 1
    result = []
    for n in range(1,max+1):
        if(n%2 == 0):
            result.append(str(min))
            min += 1
        else:
            result.append(str(max))
            max -= 1
    result[::-1]
    print " ".join(result[::-1])
    testCases -= 1
