"""Given a list of numbers, return True if first and last number of a list is same."""

user_list =["10","20","30","40","80"]

#get the first element of the list
print("First Element of the List is: "+user_list[0])
#get the last element of the list
print("Last Element oof the List is :"+user_list[-1])
if (user_list[0])==(user_list[-1]):
   print(True)
else:
    print(False)
