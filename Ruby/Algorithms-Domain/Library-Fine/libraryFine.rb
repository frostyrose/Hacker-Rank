# Enter your code here. Read input from STDIN. Print output to STDOUT
actualReturn = gets.split(" ")
expectedReturn = gets.split(" ")
fine = 0
if (actualReturn[2] != expectedReturn[2])
    if(actualReturn[2] > expectedReturn[2])
        fine = 10000
    end
elsif (actualReturn[1] != expectedReturn[1])
    if(actualReturn[1] > expectedReturn[1])
        fine = 500 * (actualReturn[1].to_i - expectedReturn[1].to_i)
    end
elsif (actualReturn[0] != expectedReturn[0])
    if (actualReturn[0] > expectedReturn[0])
        fine = 15 * (actualReturn[0].to_i - expectedReturn[0].to_i)
    end
end
print fine.to_s
