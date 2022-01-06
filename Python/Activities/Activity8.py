li = list(input("Enter Comma seperated values :").split(","))
print(li)
firstnumber = li[0]
lastnumber = li[-1]
if(firstnumber == lastnumber):
    print("True")
else:
    print("false")
