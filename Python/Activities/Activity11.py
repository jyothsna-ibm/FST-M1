fruit_shop = {
    "apple":10,
    "banana":15,
    "orange":8,
    "peaches":15
}
key_to_check=input("what are you looking for ?").lower()
if(key_to_check in fruit_shop):
    print("Yes ,This is Avialable")
else:
    print("No ,This is not avialable")
