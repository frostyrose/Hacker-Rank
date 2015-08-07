#Python 2
# Enter your code here. Read input from STDIN. Print output to STDOUT
data = raw_input().split(" ")
totalPlayers = int(data[0])
playerNumbers = raw_input().split(" ")
for i in range(1,totalPlayers+1):
    add = True
    for player in playerNumbers:
        if (i == (int(player)+1) or i == (int(player)-1) or i==int(player)):
            add = False
    if(add):
        playerNumbers.append(i)
print len(playerNumbers)
