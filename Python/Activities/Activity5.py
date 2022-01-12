"""Write a Python program to create the multiplication table (from 1 to 10) of a number."""

a = input("Enter any Number between 1 to 100: ").lower()
for i in range (1,11):
    value =int(a)*i
    myTable ="{} X {} = {}"
    print(myTable.format(a, i,value))