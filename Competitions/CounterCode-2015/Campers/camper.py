# Python 2
# Enter your code here. Read input from STDIN. Print output to STDOUT
data = raw_input().split(" ")
totalPlayers = int(data[0])
playerNumbers = raw_input().split(" ")
i = 1
while i < totalPlayers+1:
    add = True
    #if (i == (int(player)+1) or i == (int(player)-1) or i==int(player)):
    if ((str(i) in playerNumbers) or (str(i+1) in playerNumbers) or (str(i-1) in playerNumbers)):
        add = False
    if(add):
        playerNumbers.append(i)
        i += 2
    else:
        i += 1
print len(playerNumbers)
