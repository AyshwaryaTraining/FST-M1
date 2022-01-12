"""Ask the user for a number.
Depending on what number they enter, tell them if the number is an even or odd number."""

number = input("Enter the Number: ")
if(int(number)%2==0):
    print(number + " is a even number")
else:
    print(number + " is an odd number")