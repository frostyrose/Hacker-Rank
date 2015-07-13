# Python 2
# Enter your code here. Read input from STDIN. Print output to STDOUT
height = input()
for i in range(1,height+1):
    print str(" " * (height-i)) + str("#" * i)
