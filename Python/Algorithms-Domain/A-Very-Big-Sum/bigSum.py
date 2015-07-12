# Enter your code here. Read input from STDIN. Print output to STDOUT
junk = raw_input() #Toss this away
raw = raw_input()
data = raw.split(" ")
sum = 0
for num in data:
    sum += int(num)
print sum
