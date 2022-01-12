"""Write a program that asks the user to enter their name and their age.
Print out a message addressed to them that tells them the year that they will turn 100 years old."""

User_name = input("Enter your Name: ")
User_age = input("Enter your Age: ")
final_age = 2022 - int(User_age) +100
print(User_name+" is 100 years old in "+str(final_age)+" year")