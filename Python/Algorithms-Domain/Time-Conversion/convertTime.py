# Python 2
# Enter your code here. Read input from STDIN. Print output to STDOUT
data = raw_input()
hour = int(data[0:2])
if(data[8:10] == "PM"):
    if(not hour == 12):
        hour += 12
        print str(hour) + data[2:8]
    else:
        print data[0:8]
elif(hour == 12):
    print "00" + data[2:8]
else:
    print data[0:8]
