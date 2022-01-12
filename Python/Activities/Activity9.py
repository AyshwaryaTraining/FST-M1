"""Given a two list of numbers create a new list such that new list should contain
only odd numbers from the first list and even numbers from the second list."""

First_List = ["20","55","30","99","22"]
Second_List = ["11","21","30","45","50"]
#Print First List
print(First_List)
#Print Second List
print(Second_List)

#Third List
Third_List =[]

for x in First_List:
    if(int(x)%2!=0):
        Third_List.append(x)
for y in Second_List:
    if(int(y)%2==0):
        Third_List.append(y)
print(Third_List)