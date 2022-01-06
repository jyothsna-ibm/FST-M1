list1 = [10,20,23,11]
list2 = [13,43,24,55]
print("First List", list1 )
print("Second List",list2)
list3 = []
for num in list1:
    if(num%2!=0):
        list3.append(num)
for num in list2:
    if(num%2==0):
        list3.append(num)
print("Result List :",list3)
