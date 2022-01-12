"""Write a Python program to calculate the sum of all the elements in a list."""

example_list =list(input("Enter the values for List").split(","))
y=0
for x in example_list:
    y=y+int(x)

print(y)