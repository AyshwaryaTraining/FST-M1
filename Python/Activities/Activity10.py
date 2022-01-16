"""Given a tuple of numbers, iterate through it and print only those numbers
 which are divisible by 5"""

ex_tuple=(10,21,23,25,45,50)
print("All the Numbers present in the tuple :" ,ex_tuple)
for item in ex_tuple:
    if(item%5==0):
        print (item)
