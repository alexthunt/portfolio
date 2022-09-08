import random

player = input("rock, paper, or scissors?")
computer = random.randint(1, 3)
if (computer == 1) & (player == "rock"):
    print("Tie")
elif (computer == 1) & (player == "paper"):
    print("Win")
elif (computer == 1) & (player == "scissors"):
    print("Lose")
elif (computer == 2) & (player == "rock"):
    print("Lose")
elif (computer == 2) & (player == "paper"):
    print("Tie")
elif (computer == 2) & (player == "scissors"):
    print("Win")
elif (computer == 3) & (player == "rock"):
    print("Win")
elif (computer == 3) & (player == "paper"):
    print("Lose")
else:
    print("Tie")
