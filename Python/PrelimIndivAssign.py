# Reversing an int
num = int(3487)
rev = 0

print("Original : {}".format(num))

for x in range(len(str(num))):
    rev = int((rev*10) + (num%10))
    num = int(num/10)

print("Reversed : {}".format(rev))

#counting even and odd
evenCount = 0
oddCount = 0
temp = rev
for x in range(len(str(rev))):
    if temp%2 == 1:
        oddCount = oddCount + 1
        temp = int(temp/10)
    else:
        evenCount = evenCount+1
        temp = int(temp/10)
print("Evens : {}".format(evenCount))
print("Odds : {}".format(oddCount))

#even or odd
if rev%2 == 1:
    print("The Reverse of the int is odd")
else:
    print("The reverse of th int is even")