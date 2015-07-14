# Implemented in Python 2
# Enter your code here. Read input from STDIN. Print output to STDOUT
def updateChar(char, increment):
    charVal = ord(char)
    if charVal > 90: #LowerCase
        if(charVal+increment > 122):
            return chr(charVal+increment-26)
        else:
            return chr(charVal+increment)
    else:
        if(charVal+increment > 90):
            return chr(charVal+increment-26)
        else:
            return chr(charVal+increment)

strLen = raw_input()
string = raw_input()
increment = int(input())
encryptedString = []
for char in string:
    if(char.isalpha()):
        encryptedString.append(updateChar(char, increment%26))
    else:
        encryptedString.append(char)
print "".join(encryptedString)
