"""Create a Python dictionary that contains a bunch of fruits and their prices.

Write a program that checks if a certain fruit is available or not."""

fruits ={
   "Banana" : 30,
   "Apple"  : 120,
   "Orange" : 60,
}
friutName = input("Enter the Fruit name: ").lower()

if(friutName in fruits):
    print("Yes, this fruit is available")
else:
    print("No, this fruit is not available")

