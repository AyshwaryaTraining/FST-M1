"""Enhance the previously written Rock-Paper-Scissors code so that it asks the user
if they want to play another round.
If they say 'Yes', the game should begin again.
If they say 'No', the game should exit."""

Player_1 = input("Enter your name: ")
Player_2 = input("Enter your name: ")

while True:
    User_Answer_1 = input(Player_1+" Select any one : Paper, Scissors or Rock: ").lower()
    User_Answer_2 = input(Player_2+" Select any one : Paper, Scissors or Rock: ").lower()

    if User_Answer_1==User_Answer_2:
        print("It is a Tie")
    elif User_Answer_1=="rock":
       if User_Answer_2=="scissors":
        print(Player_1+" win "+User_Answer_1)
       else:
        print(Player_2+" win "+User_Answer_2)
    elif User_Answer_1=="scissors":
         if User_Answer_2=="paper":
          print(Player_1+" win "+User_Answer_1)
         else:
          print(Player_2+" win "+User_Answer_2)
    elif User_Answer_1=="paper":
        if User_Answer_2=="rock":
            print(Player_1+" win "+User_Answer_1)
        else:
            print(Player_2+" win "+User_Answer_2)
    else:
        print("user enter the invalid choice")

    repeat = input("Do you want to repeate the Game!!!! Yes/No").lower()
    if repeat=="yes":
     pass
    elif repeat=="no":
     raise SystemExit
    else:
     print("user enter the invalid choice")
     print("Exit, Thankyou")
     raise SystemExit
